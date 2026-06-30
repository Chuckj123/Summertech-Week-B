public class Array{
    public static void main(String[]args){
        String[] names = new String[4];
        int x = 94;
        int[] grades = {x,100,99};
        int grade1 = grades[2];
        grades[0] =98;
        names[0] = "lucas";
        names[1] = "Charlie";
        names[2] = "Julian";
        names[3] = "luke";
        for(int i = 0; i < 4; i++){
            System.out.println(names[i]);
        }

    }
}