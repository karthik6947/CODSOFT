import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Student
{
	private String name;
	private Map<String,Integer>marks;
	public Student(String name){
		this.name=name;
		this.marks=new HashMap<>();
	}
public String getName(){
	return name;
}
public void setMark(String subject,int mark){
	this.marks.put(subject,mark);
}
public int totalMarks(){
	int total=0;
	for(int mark:marks.values()){
		total+=mark;
	}
	return total;
}
public Map<String, Integer> getMarks() {
        return marks;
    }

public double averageCaluculation(){
	if (marks.size()==0)
	{
		return 0;
	}
	else{
		return (double)totalMarks()/marks.size();
	}
}
public String caluculateGrade(double averagepercentage){
	if(averagepercentage>=90){
		return "A";
		}
	else if(averagepercentage>=90){
		return "A";
		}
	else if(averagepercentage>=80){
		return "B";
		}
	else if(averagepercentage>=70){
		return "C";
		}
	else if(averagepercentage>=60){
		return "D";
		}
	else return "F";
		
}
}

public class StudentMarks
{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("WELCOME TO  STUDENT MARKS SYSTEM ");
		System.out.println("ENTER THE STUDENT NAME : ");
		String name=scanner.nextLine();
		Student student=new Student(name);
		System.out.println("ENTER YOUR MARKS IN EACH SUBJECT : ");
		System.out.println("PLEASE ENTER (done) if you completed entering of all subjects ");
		
		while(true){
			System.out.println("ENTER THE SUBJECT NAME : ");
			String subject=scanner.nextLine();
			if(subject.equalsIgnoreCase("done")){break;}
			System.out.println("ENTER YOUR MARKS  IN THE SUBJECT: ");
			int mark=scanner.nextInt();
			scanner.nextLine();
			student.setMark(subject,mark);
		}
		int totalmarks=student.totalMarks();
		double averagepercentage=student.averageCaluculation();
		String grade=student.caluculateGrade(averagepercentage);
		System.out.println("STUDNET NAME IS : "+student.getName());
		System.out.println("STUDNET MARKS ARE :");
		for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());}
		
		System.out.println("STUDNET TOTAL MARKS ARE:  "+totalmarks);
		System.out.println("STUDNET AVERAGE PERCENTAGE IS : "+averagepercentage+"%");
		System.out.println("STUDNET SECURE GARDE IS: "+grade);
		scanner.close();
		
	
}
}