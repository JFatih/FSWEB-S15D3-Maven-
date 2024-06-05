package org.example;


import org.example.entity.Employee;

import java.util.*;

import static java.util.Collections.list;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        Employee work1 = new Employee(1,"Fatih", "çakmak");
        Employee work2 = new Employee(1,"Ali", "Alii");
        Employee work3 = new Employee(1,"Veli", "Velii");
        Employee work4 = new Employee(1,"Kerem", "keremm");
        Employee work5 = new Employee(1,"Ali", "Alii");
        Employee work6 = new Employee(1,"Fatih", "çakmak");

        employees.add(work1);
        employees.add(work2);
        employees.add(work3);
        employees.add(work4);
        employees.add(work5);
        employees.add(work6);

        System.out.println(employees);

    }



    public static List<Employee> findDuplicates(List<Employee> list){
        List<Employee> resultList = new LinkedList<>();
        for(int i = 0 ; i < list.size() ; i ++ ){
            for(int a = i+1 ; a < list.size() ; a++ ){
                if(list.get(i).equals(list.get(a))){
                    resultList.add(list.get(i));
                }
            }
        }
        return resultList;
    }


    public static Map<Integer, Employee> findUniques(List<Employee> list){
        List<Employee> copyList = new ArrayList<>(list);
        List<Employee> dupList = findDuplicates(list);
        copyList.removeAll(dupList);
        copyList.addAll(dupList);
        Map<Integer, Employee> resulList = new HashMap<>();
        for(Employee employee : copyList){
            if(employee != null){
                resulList.put(employee.getId(), employee);
            }
        }
        return resulList;
    }

    public static List<Employee> removeDuplicates(List<Employee> list){
        List<Employee> copyList = new ArrayList<>(list);
        copyList.removeAll(findDuplicates(list));
        List<Employee> resultList = new ArrayList<>();
        for(Employee employee : copyList){
            if(employee != null){
                resultList.add(employee);
            }
        }
        return resultList;
    }

}