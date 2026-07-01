public class Cabinet{
    public static void main(String[]args){
        String[][] cabinet = new String[3][4];
        cabinet[0][0] = "cups";
        cabinet[0][1] = "doritos";
        cabinet[0][2] = "forks";
        cabinet[1][0] = "plates";
        cabinet[2][2] = "glasses";
        for (int r = 0; r<=2; r++){
           
            for(int c = 0; c<=3; c++ ){
            System.out.print(cabinet[r][c]+ ", ");

            }
            System.out.println( );
        }
    }
}