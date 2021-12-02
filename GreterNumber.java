import java.util.Scanner;

public class GreterNumber {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c= in.nextInt();
        if(a>c && a>b) {
            System.out.println("A is gretest number");
        }else if (b>c && b>c){
            System.out.println("B is gretest number");
        } else if (c>a && c>b) {
            System.out.println("C is gretest number");
        }else {
            System.out.println("zero");
                }
            }
        }
