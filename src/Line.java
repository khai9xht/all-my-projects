public class Line {
    private Point A,B;
    private double a,b,c;
    public Line(){
        a = 0;  b = 0;  c = 0;      //hệ số của phương trình đường thẳng
        A = new Point();
        B = new Point();
    }
    public void setPoint(Point M, Point N) {
        A.setX(M.getX());   A.setY(M.getY());
        B.setX(N.getX());   B.setY(N.getY());
    }
    public void setLine(){              // viết phương trình đường thẳng
        if(A.getX() == B.getX()) {
            a = 1;    b = 0;    c = A.getX();
        }
        else if(A.getY() == B.getY()){
            a = 0;    b = 1;    c = A.getY();
        }
        else{
            a = B.getY() - A.getY();
            b = A.getX() - B.getX();
            c = -B.getX() * A.getY() +B.getY() * A.getX();
        }
    }
    public void RelationshipWith1(Line d){                   //quan hệ giữa 2 đường thẳng   cach 1
        //tính định thức để tìm giao điểm
        double det_c = this.a*d.b - this.b*d.a;               //det(a,b)
        double det_a = this.b*d.c - this.c*d.b;               //det(b,c)
        double det_b = this.a*d.c - this.c*d.a;               //det(c,a)
        if(det_c == 0){
            if(det_a == 0) {
                System.out.print("2 đoạn thẳng trên cùng nằm trên một đường thẳng và");
                if( ( this.A.getX() >= d.A.getX() && this.A.getX() <=d.B.getX() )           // nếu 1 điểm của đường thẳng này
                        || (this.B.getX() >= d.A.getX() && this.B.getX() <=d.B.getX() ) )       // nằm giữa 2 điểm của đường thẳng kia
                    System.out.println(" có 1 phần trùng nhau ");
                else System.out.println(" không giao nhau ");
            }else System.out.println("2 đoạn thẳng trên song song( không giao nhau) ");
        }else{
                // tìm giao điểm
            Point C = new Point();
                C.setX( det_a/det_c);
                C.setY( det_b/det_c);
                // Kiểm tra xem C có nằm trên 1 trong 2 đoạn thẳng hay ko
                if( ( C.getX() >= d.A.getX() && C.getX() <= d.B.getX() )
                        || (C.getX() <= d.A.getX() && C.getX() >= d.B.getX() ))
                    System.out.println("2 đoạn thẳng trên giao nhau");
                else System.out.println("2 đoạn thẳng trên không giao nhau");
        }
    }
    public void RelationshipWith2(Line d){                  //canh 2
        double p1 = (this.a*(d.A.getX()) + this.b*(d.A.getY()) - this.c);                //(ax1+by1+c)(ax2+by2+c)
        double p2 = (this.a*(d.B.getX()) + this.b*(d.B.getY()) - this.c);        //xét vị trí tương đối của 2 điểm đối với đường thẳng
        double q1 = (d.a*(this.A.getX()) + d.b*(this.A.getY()) - d.c);
        double q2 = (d.a*(this.B.getX()) + d.b*(this.B.getY()) - d.c);
        if(p1==0 && p2==0) {
            System.out.print("2 đoạn thẳng trên cùng nằm trên một đường thẳng và");
            if( ( this.A.getX() >= d.A.getX() && this.A.getX() <=d.B.getX() )           // nếu 1 điểm của đường thẳng này
                    || (this.B.getX() >= d.A.getX() && this.B.getX() <=d.B.getX() ) )       // nằm giữa 2 điểm của đường thẳng kia
                System.out.println(" có 1 phần trùng nhau ");
            else System.out.println(" không giao nhau ");
        }else if((p1==0 && p2!=0) || (p1!=0 && p2==0) || (q1==0 && q2!=0) || (q1!=0 && q2==0)               //5 trường hợp: A thuộc d, B ko thuộc d (tương tụ 3 th nữa)
                    ||(p1*p2 <0 && q1*q2<0)) System.out.println("2 đoạn thẳng trên giao nhau");                     // th5: A vs B khác phía so với d
        else System.out.println("2 đoạn thẳng trên không giao nhau");                                               // và 2 điểm thuộc d khác phía so với this
    }
    public void RelationshipWith3(Line d){                  //cách 3

    }
}
