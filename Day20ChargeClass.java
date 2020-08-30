public class Day20ChargeClass {
        //instance variable
        private final double rx,ry;
        private final double q;

        //constructor
        public Day20ChargeClass(double x0, double y0, double q0){
                rx=x0;
                ry=y0;
                q=q0;
        }

        //instance method
        public double potentialAt(double x, double y){
                double k=8.99e009;
                double dx=x-rx;
                double dy=y-ry;
                return k*q/Math.sqrt(dx*dx + dy*dy);
        }

        //instance method
        public String toString(){
                return q+" at "+"("+rx+", "+ry+")";
        }

        //main method
        public static void main(String[] args){
                double x=Double.parseDouble(args[0]);
                double y=Double.parseDouble(args[1]);

                //create and intialize object
                Day20ChargeClass c1=new Day20ChargeClass(0.51,0.63,21.3);
                Day20ChargeClass c2=new Day20ChargeClass(0.13,0.94,81.9);

                //invoke method
                double v1=c1.potentialAt(x,y);
                double v2=c2.potentialAt(x,y);
                System.out.printf("%.2e\n",(v1+v2));
        }
}
