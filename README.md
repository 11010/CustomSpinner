# CustomSpinner
It's such a nice jod to write code for Android.Today I creat a responsitory for Spinner.

step1.  Delete TextView and set AppTheme option-> Select HoloLight option

step2.  Type Spinner in activity_main.xml file.

step3.  Creat Spinner item Layout file.

step4.  Also creat AppTheme HoloLight->Add textView

step5.  Creat Java class,SpinnerAdapter,of course,it extend BaseAdapter the same as ListView&GrideView.

step6.  Creat three private property,and use Alt+Insert to Creat crustructer function.

step7.  creat List<String>ListSource = new ArrayList<>().

step7.5 The Adapter need parames,so send them from mainActivity.InitData in MainActivity.

step8   get DropdownView

step9   delete super function of getDropDownView

step10  Spinner set dropdownPosition.
