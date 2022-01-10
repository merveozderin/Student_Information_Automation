public class Teacher
{
        String name;
        int phno;
        String branch;

        public Teacher(String name, int phno, String branch)
        {
            this.name = name;
            this.phno = phno;
            this.branch = branch;
        }

        void print()
        {
            System.out.println("Name: " +this.name);
            System.out.println("Phone: " +this.phno);
            System.out.println("Department: " +this.branch);
        }


}
