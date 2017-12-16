// CHECKSTYLE:OFF:FileLength
public class MyVector
    {
        private int x;
        private int y;
        private static boolean degrees = true;
        private static final double EPSILON = 1E-14;

        public MyVector(int aX, int aY)
        {
            x = aX;
            y = aY;
        }

        public MyVector()
        {
            x = ((int)(Math.random()*21))-10;
            y = ((int)(Math.random()*21))-10;
        }

        public boolean equals(Object other)
        {
           MyVector otherVector = (MyVector)other;  //type cast
           return this.x == otherVector.x
                    && this.y == otherVector.y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
             return y;
        }

        public void setComponents(int newX, int newY)
        {
            x = newX;
            y = newY;
        }

        public double magnitude()
        {
            return Math.sqrt(x*x + y*y);
        }

        public static void changeMode()
        {
            degrees = !degrees;
        }

        public int dot(MyVector other)
        {
            return x*other.x + y*other.y;
        }

        public void dilate(double factor)
        {
            x = (int)(x*factor);
            y = (int)(y*factor);
        }

        public double angle(MyVector other)
        {
            double the_angle = Math.acos( (this.dot(other))/(this.magnitude()*other.magnitude()));
            if(degrees)
            {
                the_angle *= (180.0/Math.PI);
            }
            return Math.round(the_angle*1000000)/1000000.0;
        }

        public boolean isOrthogonal(MyVector otherVector)
        {
            return this.dot(otherVector)==0;
        }

        public double ratio()
        {
            return (double)x/y;
        }

        public boolean isParallel(MyVector otherVector)
        {
            /**
             * Vectors are parallel if their components are multiples of each other.
             */
            if(this.y == 0){
                return otherVector.y == 0;}
            else if(otherVector.y == 0){
                return this.y ==0;}
            return Math.abs(this.ratio()-otherVector.ratio()) <= EPSILON;
        }

        public String toString()
        {
            return "<" + x + "," + y + ">";
        }
    }