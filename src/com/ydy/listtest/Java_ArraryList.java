package com.ydy.listtest;


import java.util.ArrayList;

public class Java_ArraryList {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	static ArrayList<Student> ArraryListClass = new ArrayList();//<Student>

    static void ShowAllContentInArraryList(ArrayList ShowArrayList) {
        System.out.println("ShowArrayList total size= " + ShowArrayList.size());
        for (int i = 0; i < ShowArrayList.size(); i++)
            System.out.println("ShowArrayList" + "<" + i + ">" + "=" + ((Student) ShowArrayList.get(i)).name + " ID =" + ((Student) ShowArrayList.get(i)).id);

    }

    public static void main(String[] args) {

        Student xiaotang = new Student();
        xiaotang.id = "001";
        xiaotang.name = "小唐";
        System.out.println("The ID " + xiaotang.id +
                " name is " + xiaotang.name);

        Student xiaowei = new Student();
        xiaowei.id = "002";
        xiaowei.name = "小韦";
        xiaowei.age = 18;
        String sex = "female";
        xiaowei.inputSex(sex);
        xiaowei.score = 90.5;
        System.out.println("The ID of xiaowei=" + xiaowei.id
                + " of the basic information is "
                + "name : " + xiaowei.name
                + "age : " + xiaowei.age
                + "sex : " + xiaowei.sex
                + "score: " + xiaowei.score);


        Student xiaoming = new Student();
        xiaoming.id = "003";
        xiaoming.name = "小明";
        xiaoming.age = 18;

        Student xiaohong = new Student();
        xiaohong.id = "004";
        xiaohong.name = "小红";
        xiaohong.age = 18;


        Student doudou = new Student();
        doudou.id = "004";
        doudou.name = "豆豆";
        doudou.age = 18;

        Student guoguo = new Student();
        guoguo.id = "004";
        guoguo.name = "果果";
        guoguo.age = 18;

        Student xiaonan = new Student();
        xiaonan.id = "008";
        xiaonan.name = "小南";
        xiaonan.age = 18;
        // public boolean add(E element); 将指定的元素添加到此列表的尾部。添加成功返回true
        ArraryListClass.add(xiaotang);
        ArraryListClass.add(xiaowei);
        ArraryListClass.add(xiaoming);
        ArraryListClass.add(xiaohong);
        ArraryListClass.add(doudou);
        System.out.println("\npublic boolean add(E element)!");
        ShowAllContentInArraryList(ArraryListClass);
        //public Object get(int index); 返回此列表中指定位置上的元素
        ((Student) ArraryListClass.get(3)).inputID("9527");
        ((Student) ArraryListClass.get(2)).inputName("乐乐");
        ShowAllContentInArraryList(ArraryListClass);

        //public boolean remove(Object o) 移除此列表中首次出现的指定元素（如果存在）。如果列表不包含此元素，则列表不做改动。
        ArraryListClass.remove(doudou);
        System.out.println("\npublic boolean remove(Object o)!");
        ShowAllContentInArraryList(ArraryListClass);

        //public boolean remove(int index) 移除此列表中指定位置的元素，返回从列表中移除的元素
        ArraryListClass.remove(3);
        System.out.println("\npublic boolean remove(int index)!");
        ShowAllContentInArraryList(ArraryListClass);

        ArraryListClass.add(xiaotang);
        System.out.println("\nArraryListClass.add(xiaotang)!");
        ShowAllContentInArraryList(ArraryListClass);

        /*
              public void add(int index, E element)
             将指定的元素插入此列表中的指定位置。向右移动当前位于该位置的元素（如果有）以及所有后续元素（将其索引加 1）
           */
        ArraryListClass.add(2, guoguo);
        System.out.println("\npublic void add(int index, E element)!");
        ShowAllContentInArraryList(ArraryListClass);

      /*
		try{
			ArraryListClass.add("shenzhen");
		    ShowAllContentInArraryList(ArraryListClass);
            }catch(Exception e)
            {
				System.out.println("failed to added\n");
            }
	  */
       /*
           *******************************************************************************************************************

             public boolean contains(Object o);
             如果此列表中包含指定的元素，则返回 true
	     *******************************************************************************************************************
          */
        if (ArraryListClass.contains(xiaotang) == true)
            System.out.println("This ArraryList contains xiaotang! ");
        else
            System.out.println("This ArraryList donot contains xiaotang! ");

        if (ArraryListClass.contains(xiaonan) == true)
            System.out.println("This ArraryList contains xiaonan! ");
        else
            System.out.println("This ArraryList donot contains xiaonan! ");

      /*
          ********************************************************************************************************************
            public int indexOf(Object o)
            返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
          ********************************************************************************************************************
          */
        System.out.println("ArraryListClass.IndexOf(xiaotang)= " + ArraryListClass.indexOf(xiaotang));

     /*
          ********************************************************************************************************************
          public int lastIndexOf(Object o)
          返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。          ********************************************************************************************************************
	   ********************************************************************************************************************
          */
        System.out.println("ArraryListClass.IndexOf(lastIndexOf)=" + ArraryListClass.lastIndexOf(xiaotang));
        System.out.println("ArraryListClass.IndexOf(xiaonan)=" + ArraryListClass.lastIndexOf(xiaonan));

	   /*
	     ********************************************************************************************************************
	     public boolean isEmpty();
            如果此列表中没有元素，则返回 true
            ********************************************************************************************************************
	     */
        if (ArraryListClass.isEmpty() == true)
            System.out.println("Before clear,This is empty arraylist! ");
        else
            System.out.println("Before clear,This is not empty arraylist! ");

	    /*
		********************************************************************************************************************
	       public E set(int index, E element);

		 用指定的元素替代此列表中指定位置上的元素。返回值为以前位于该指定位置上的元素
	        ********************************************************************************************************************
		*/
        ArraryListClass.set(3, xiaonan);
        ShowAllContentInArraryList(ArraryListClass);

	  	/*
		 ********************************************************************************************************************
		 public void clear()
              移除此列表中的所有元素。此调用返回后，列表将为空
	      ********************************************************************************************************************
		 */

        ArraryListClass.clear();
        System.out.println("\npublic void clear()! ");
        ShowAllContentInArraryList(ArraryListClass);
        if (ArraryListClass.isEmpty() == true)
            System.out.println("After clear,This is empty arraylist! ");
        else
            System.out.println("After clear,This is not empty arraylist! ");


    }
}