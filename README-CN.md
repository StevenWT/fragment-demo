[ENGLISH](README.md)
# 一个Activity多个Fragment 导航 demo 项目
### 不借助第三方库，使用原生方法导航
### 借助第三方库fragmentation实现导航
### 使用Google 的navigation实现导航
[Navigation, Saving fragment state](https://github.com/googlesamples/android-architecture-components/issues/530)
> 我期望fragment栈可以保存自己的view不被销毁.Google的navigation库使用了 `replace()` 方法替换fragment,这样会导致栈底的fragment view被销毁, 我期望可以使用 `add()/hide()` 方法替换fragment,这样就可以保存fragment的view不被销毁.所以我的解决方案是不直接饮用google的库 `implementation "androidx.navigation:navigation-fragment:$nav_version"`, 而是把这个库的源码直接放到自己的项目里, 然后修改这个库的实现，把`replace()` 方法替换成 `hide()/add()` 方法.

* 修改的类`androidx.navigation.fragment.FragmentNavigator.java`

```
public NavDestination navigate(@NonNull Destination destination, @Nullable Bundle args,
            @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        
//      ft.replace(mContainerId, frag);

//      上面的代码注释修改为下面的代码

        if(mFragmentManager.getFragments().size()>0){
            ft.hide(mFragmentManager.getFragments().get(mFragmentManager.getFragments().size()-1));
            ft.add(mContainerId, frag);
        }else {
            ft.replace(mContainerId, frag);
        }
        
}
```