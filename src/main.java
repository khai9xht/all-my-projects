import java.util.Scanner;
public class main {
    public static void main( String[] args){
        Line d1 = new Line();
        Line d2 = new Line();
        Point A1 = new Point();
        Point B1 = new Point();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tọa độ 2 điểm của đường thẳng thứ nhất:");
        System.out.println("    tọa độ điểm thứ nhất:");
        System.out.print("        hoành độ:");
            A1.setX(input.nextDouble());
        System.out.print("        tung độ:");
            A1.setY(input.nextDouble());
        System.out.println("    tọa độ điểm thứ hai:");
        System.out.print("        hoành độ:");
            B1.setX(input.nextDouble());
        System.out.print("        tung độ:");
            B1.setY(input.nextDouble());
        d1.setPoint(A1,B1);
        d1.setLine();

        Point A2 = new Point();
        Point B2 = new Point();
        System.out.println("Nhập tọa độ 2 điểm của đường thẳng thứ hai:");
        System.out.println("    tọa độ điểm thứ nhất:");
        System.out.print("        hoành độ:");
            A2.setX(input.nextDouble());
        System.out.print("        tung độ:");
            A2.setY(input.nextDouble());
        System.out.println("    tọa độ điểm thứ hai:");
        System.out.print("        hoành độ:");
            B2.setX(input.nextDouble());
        System.out.print("        tung độ:");
            B2.setY(input.nextDouble());
        d2.setPoint(A2,B2);
        d2.setLine();

        d1.RelationshipWith1(d2);
        d1.RelationshipWith2(d2);
    }
}
