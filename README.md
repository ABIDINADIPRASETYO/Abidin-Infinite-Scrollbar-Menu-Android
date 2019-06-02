# Abidin-Infinite-Scrollbar-Menu-Android

Infinite Scrollbar Menu Made by Android Studio

![Alt text](https://github.com/ABIDINADIPRASETYO/Abidin-Infinite-Scrollbar-Menu-Android/blob/master/Demo/demo%20gif.gif "Infinite Scrollbar Menu Android")

# Library Usage

Step 1. Add the JitPack repository to your build file 


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.ABIDINADIPRASETYO:Abidin-Infinite-Scrollbar-Menu-Android:1.0.0'
	}
	
# Usage
```XML
<com.example.abidininfinitescrolllibrary.widget.LoopBarView
        android:id="@+id/endlessView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:enls_placeholderId="@id/placeHolder"
        app:enls_orientation="horizontal"
        app:enls_selectionGravity="start"
        app:enls_selectionMargin="10dp"
        app:enls_overlaySize="5dp"
        app:enls_selectionInAnimation="@animator/enls_scale_restore"
        app:enls_selectionOutAnimation="@animator/enls_scale_small"
        app:enls_selectionBackground="@android:color/holo_blue_dark"
        app:enls_menu="@menu/loopbar"
        app:enls_scrollMode="auto"
        />
```

```enls_overlaySize``` & ```enls_placeholderId``` are used for overlay feature.
Placeholder must be the view lying under the LoopBar. And it's used for setting bounds In layout when selected view has overlay.
LoopBar will set width or height for this view by itself (depending of LoopBar orientation), it will be the same as LoopBar has.
Without this placeholder the bounds of LoopBar will be limited by selected view (with overlay). And thanks to placeholder the bounds
will be limited only by list of groups. You can see an example of overlay usage in sample.

|  attribute name | description |
|---|---|
| enls_overlaySize  | a size of selected view overlaying |
| enls_orientation | orientation of loopbar view. Can be verticalLeft, verticalRight, horizontalBottom, horizontalTop. Default verticalLeft
| enls_placeholderId | an id of view on which you should use layout:above or other attributes of RelativeLayouts,  because LoopBarView will have increased height in this case. See more in sample |
| enls_selectionGravity | a gravity of selection view. Can be vertical or horizontal. Default horizontal |
| enls_selectionMargin | a margin of selectionView from bounds of view. Default ```5dp``` |
| enls_selectionInAnimation | an animation of appearing an icon inside selection view |
| enls_selectionOutAnimation | an animation of hiding an icon inside selection view |
| enls_selectionBackground | selection background. Default ```#ff0099cc``` |
| enls_menu | an id of menu which will be used for getting title and icon items  |
| enls_scrollMode | Scrolling mode. Can be ```infinite```, ```finite```, ```auto```. Default ```infinite``` |
| android:background | View have yellow background by default. Use standart ```android:background``` attribute to change it. Default ```#ffc829``` |


To initialize items in widget and work with it you should setup adapter to it and add item click mListener:
```
LoopBarView loopBarView = findViewById(...);
categoriesAdapter = new SimpleCategoriesAdapter(MockedItemsFactory.getCategoryItems(getContext()));
loopBarView.setCategoriesAdapter(categoriesAdapter);
loopBarView.addOnItemClickListener(this);
```
Here SimpleCategoriesAdapter is used which required collection of [ICategoryItem] objects (to draw default view with icon and text).
<br /> Also you can setup adapter through:
*   **Menu** via Java code (see example [MenuLoopBarFragment]):
``` 
        loopBarView.setCategoriesAdapterFromMenu(R.menu.loopbar);
        //or
        Menu menu = ...;
        loopBarView.setCategoriesAdapterFromMenu(menu);
```
    or via XML:
```
        <com.cleveroad.loopbar.widget.LoopBarView
        ...
        app:enls_menu="@menu/loopbar"
        />
```
* **ViewPager**. Just set a viewPager into your LoopBar. If you want to show category icons, your ViewPager adapter must implement [ILoopBarPagerAdapter] interface (see example [ViewPagerLoopBarFragment]), otherwise the icons will not be shown:
```
    loopBarView.setupWithViewPager(viewPager);
```

To customize wrapped ```RecyclerView``` (control animations, decorators or add ```RecyclerView.OnScrollListener```) you are able to use following methods:

|  method name | description |
|---|---|
| ```setItemAnimator(RecyclerView.ItemAnimator animator)```  | Sets the ```ItemAnimator``` to wrapped RecyclerView |
| ```isAnimating()```  | Returns true if wrapped RecyclerView is currently running some animations |
| ```addItemDecoration(RecyclerView.ItemDecoration decor)```   | Add an ```ItemDecoration``` to wrapped RecyclerView |
| ```addItemDecoration(RecyclerView.ItemDecoration decor, int index)```  | Add an ```ItemDecoration``` to wrapped RecyclerView |
| ```removeItemDecoration(RecyclerView.ItemDecoration decor)``` | Remove an ```ItemDecoration``` from wrapped RecyclerView |
| ```invalidateItemDecorations()``` | Invalidates all ```ItemDecoration```s in wrapped RecyclerView |
| ```addOnScrollListener(RecyclerView.OnScrollListener listener)``` | Add a ```OnScrollListener``` to wrapped RecyclerView |
| ```removeOnScrollListener(RecyclerView.OnScrollListener listener)``` | Remove a ```OnScrollListener``` from wrapped RecyclerView |
| ```clearOnScrollListeners()``` | Remove all secondary ```OnScrollListener``` from wrapped RecyclerView |



