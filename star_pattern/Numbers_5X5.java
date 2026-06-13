package star_pattern;
/*

11111                                                        
22222                                                        
33333                               
44444
55555

*/
public class Numbers_5X5 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
