package sef.ATestTask.FirstActivity;

import java.util.ArrayList; // import the ArrayList class


public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        Employee em1 = new Employee( "John", "White", 33 );
        em1.setEmpId(1);
        em1.setJobTitle("Driver");
        em1.setCompanyName("Microsoft");
        em1.setSalary(1000);

        Employee em2 = new Employee( "Sam", "Black", 25 );
        em2.setEmpId(2);
        em2.setJobTitle("Engeneer");
        em2.setCompanyName("Apple");
        em2.setSalary(1200);

        Employee em3 = new Employee( "Bob", "Smith", 48 );
        em3.setEmpId(3);
        em3.setJobTitle("Engeneer");
        em3.setCompanyName("Apple");
        em3.setSalary(1300);

        Employee em4 = new Employee( "Mike", "Piterson", 56 );
        em4.setEmpId(4);
        em4.setJobTitle("QA");
        em4.setCompanyName("Accenture");
        em4.setSalary(1400);

        Employee em5 = new Employee( "Andrew", "Clinton", 29 );
        em5.setEmpId(5);
        em5.setJobTitle("QA");
        em5.setCompanyName("TestDevLab");
        em5.setSalary(1500);

        Employee em6 = new Employee( "Scot", "Tramp", 60 );
        em6.setEmpId(6);
        em6.setJobTitle("Manager");
        em6.setCompanyName("McDonald's");
        em6.setSalary(1800);


        ArrayList<Employee> employees = new ArrayList<>(); // Create an ArrayList object

        employees.add( em1 );
        employees.add( em2 );
        employees.add( em3 );
        employees.add( em4 );
        employees.add( em5 );
        employees.add( em6 );


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        BubbleSort(employees);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getSalary()+" "+
                    employees.get(i).getFirstName()+
                    " "+employees.get(i).getSecondName());
        }


    }

    public static void BubbleSort(ArrayList<Employee> list)
    {
        Employee temp;
        if (list.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<list.size(); x++) // bubble sort outer loop
            {
                for (int i=0; i < list.size()-i; i++) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0)
                    {
                        temp = list.get(i);
                        list.set(i,list.get(i+1) );
                        list.set(i+1, temp);
                    }
                }
            }
        }

    }



}
