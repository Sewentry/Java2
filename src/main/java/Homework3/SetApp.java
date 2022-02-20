package Homework3;


import java.util.ArrayList;
import java.util.List;

public class SetApp {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("aa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("ad");
        arrayList.add("aa");
        arrayList.add("a");
        arrayList.add("aaaa");
        arrayList.add("aa");
        countWord(arrayList);
        System.out.println("Список уникальных слов:");
        arrayList.forEach(System.out::println);
        System.out.println("Количество уникальных слов:");
        System.out.println(arrayList.size());
    }
    public static void countWord(List arr){
        int res=1;
        for(int i=0;i<arr.size();i++){
            for (int j=i+1;j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    res++;
                    arr.remove(j);
                }
            }
            System.out.println(arr.get(i)+ " встречается -> "+res+ " раз");
            res=1;
        }
    }
}

