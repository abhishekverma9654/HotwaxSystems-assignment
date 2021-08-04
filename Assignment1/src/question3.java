import java.io.*;
import java.util.*;

class Employee{

    String Name;
    String Email;
    int Age;
    String DateOfBirth;
    int id;

    File employee_file=new File("Employee.txt");

    void Employee_Add(String name,String email,int age,String dob) throws IOException{
        this.Name=name;
        this.Email=email;
        this.Age=age;
        this.DateOfBirth=dob;
        this.id=Employee_id_generator();

            FileWriter fwout=new FileWriter(employee_file,true);
            fwout.write(String.valueOf(id));fwout.write(" ");
            fwout.write(Name);fwout.write(" ");
            fwout.write(Email);fwout.write(" ");
            fwout.write(String.valueOf(Age));fwout.write(" ");
            fwout.write(DateOfBirth);fwout.write("\n");
            fwout.close();
    }
    void Employee_Search(String Srh_email) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(employee_file));
        String[] contents=null;
        String[] records=null;
        String show=null;
        String s;
        int count=0;
        while((s=reader.readLine())!=null)
        {
            records=s.split("\n");
            for (String line : records)
            {
                contents=line.split(" ");
                for (String word1 : contents) {

                    if (word1.equalsIgnoreCase(Srh_email)) {
                        count++;
                        show= line;
                        break;
                    }
                }
            }
        }
        reader.close();
        if(count!=0)
            System.out.println("Record found\n"+show);
        else
            System.out.println("Record Not found");
    }
    void Employee_Delete(String del_id) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(employee_file));
        String delete;
        String task="";
        while ((delete = reader.readLine()) != null) {
            if (delete.startsWith(del_id)) {
                continue;
            }
            task+=delete+"\n";
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(employee_file));
        writer.write(task);
        reader.close();
        writer.close();
    }
    void Employee_sort(String order) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(employee_file));
        List<String> employee=new ArrayList<String>();
        String[] records=null;String s;
        while((s=reader.readLine())!=null)
        {
            records=s.split("\n");
            for (String word : records) {
                employee.add(word);
            }
        }
        if (order.equals("ascending")){
            Collections.sort(employee);
            Iterator it=employee.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }else if (order.equals("descending")){
            Collections.sort(employee,Collections.reverseOrder());
            Iterator it=employee.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
    int Employee_id_generator() throws IOException{
        int lines = 0;
        BufferedReader reader = new BufferedReader(new FileReader(employee_file));
        while (reader.readLine() != null) lines++;
            reader.close();
        return lines+1;
    }
    void Employee_id_generator2() throws IOException{
        int lines = 0;
        String s,find;
        BufferedReader reader = new BufferedReader(new FileReader(employee_file));
        while ((s=reader.readLine())!= null){
            lines++;
        }
        reader.close();
        System.out.println(lines+1);
    }
}

public class question3{
    public static void main(String[] args){

        int Employee_option=0;

        Scanner input=new Scanner(System.in);
        Employee emp=new Employee();
        try{
            do {
                System.out.println("***** Employee Menu *****");
                System.out.println("1. Add Employee");
                System.out.println("2. Delete");
                System.out.println("3. Search");
                System.out.println("4. Exit");

                Employee_option = input.nextInt();

                switch (Employee_option) {
                    case 1:
                        input.nextLine();
                        System.out.println("Enter Employee Name");
                        String emp_name=input.nextLine();
                        System.out.println("Enter Employee Email-id");
                        String emp_email=input.next();
                        System.out.println("Enter Date of Birth");
                        String emp_DOB=input.next();
                        System.out.println("Enter Employee Age");
                        int emp_age=input.nextInt();
                        emp.Employee_Add(emp_name,emp_email,emp_age,emp_DOB);
                        break;
                    case 2:
                        System.out.println("Enter Employee id");
                        String Del_id = input.next();
                        emp.Employee_Delete(Del_id);
                        break;
                    case 3:
                        System.out.println("1. Search by Email-id");
                        System.out.println("2. Sort in Ascending");
                        System.out.println("3. Sort in Descending");
                        int Inner_option= input.nextInt();
                        input.nextLine();
                        switch (Inner_option){
                            case 1:
                                System.out.println("Enter mail address for search");
                                String SearchId=input.next();
                                emp.Employee_Search(SearchId);
                                break;
                            case 2:
                                emp.Employee_sort("ascending");
                                break;
                            case 3:
                                emp.Employee_sort("descending");
                                break;
                            default:
                                System.err.println("Invalid option");
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                            emp.Employee_id_generator2();
                            break;
                    default:
                        System.err.println("Invalid Option");
                }
            }while (Employee_option!=4);
        }catch (IOException e){
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (Exception e) {
            System.err.println(e);
        }
    }
}