[中文版本](README-CN.md)
## Single Activity with multi-fragment demo
### The native management way
### Using a third-party library management style
### Using Google's navigation library management
[Navigation, Saving fragment state](https://github.com/googlesamples/android-architecture-components/issues/530)
> I want to save fragments state. Fragments according to official used the replace() method that doesn't save fragment state, but we expect to use the add()/hide() methods shows fragments to save fragment state. My solution is to not use the official implementation implementation "androidx.navigation:navigation-fragment:$nav_version", directly put the library's code in your project, and then modify the replace() method to hide()/add() method.

* androidx.navigation.fragment.FragmentNavigator.java

```
public NavDestination navigate(@NonNull Destination destination, @Nullable Bundle args,
            @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        
//      ft.replace(mContainerId, frag);

//      change to  

        if(mFragmentManager.getFragments().size()>0){
            ft.hide(mFragmentManager.getFragments().get(mFragmentManager.getFragments().size()-1));
            ft.add(mContainerId, frag);
        }else {
            ft.replace(mContainerId, frag);
        }
        
}
```