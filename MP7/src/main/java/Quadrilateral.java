// CHECKSTYLE:OFF:FileLength
public class Quadrilateral
        {
        private MyVector side1;
        private MyVector side2;
        private MyVector side3;
        private MyVector side4;

        public Quadrilateral()
        {
            side1 = new MyVector(0,1);
            side2 = new MyVector(1,0);
            side3 = new MyVector(0,-1);
            side4 = new MyVector(-1,0);
        }

        public Quadrilateral(MyVector side1, MyVector side2, MyVector side3, MyVector side4)
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
        }

        public boolean isParallelogram(){
            if (side1.isParallel(side2))
                if (side3.isParallel(side4))
                    return true;
                else
                    return false;
            else if (side1.isParallel(side3))
                if (side2.isParallel(side4))
                    return true;
                else
                    return false;
            else if (side1.isParallel(side4))
                if (side2.isParallel(side3))
                    return true;
                else
                    return false;
            else
                return false;
        }

        public boolean isRectangle(){
            if (side1.isParallel(side2))
                if (side3.isParallel(side4))
                    if (side1.isOrthogonal(side3))
                        return true;
                    else
                        return false;
                else
                    return false;
            else if (side1.isParallel(side3))
                if (side2.isParallel(side4))
                    if (side1.isOrthogonal(side2))
                        return true;
                    else
                        return false;
                else
                    return false;
            else if (side1.isParallel(side4))
                if (side2.isParallel(side3))
                    if (side1.isOrthogonal(side3))
                        return true;
                    else
                        return false;
                else
                    return false;
            else
                return false;
        }

        public boolean isRhombus(){
            if (side1.isParallel(side2))
                if (side3.isParallel(side4))
                    if (side1.angle(side3) == (side2).angle(side4))
                        return true;
                    else
                        return false;
                else
                    return false;
            else if (side1.isParallel(side3))
                if (side2.isParallel(side4))
                    if (side1.angle(side3) == (side2).angle(side4))
                        return true;
                    else
                        return false;
                else
                    return false;
            else if (side1.isParallel(side4))
                if (side2.isParallel(side3))
                    if (side1.angle(side3) == (side2).angle(side4))
                        return true;
                    else
                        return false;
                else
                    return false;
            else
                return false;
        }

        public boolean isSquare(){
            if (side1.isParallel(side2)){
                if (side3.isParallel(side4))
                    if (side1.isOrthogonal(side3))
                        if ((side1.magnitude()) == (side2.magnitude()) && ((side1.magnitude()) == (side3.magnitude())))
                            return true;
                        else
                            return false;
                    else
                        return false;
                else
                    return false;}
            else if (side1.isParallel(side3)){
                if (side2.isParallel(side4))
                    if (side1.isOrthogonal(side2))
                        if ((side1.magnitude()) == (side2.magnitude()) && ((side1.magnitude()) == (side3.magnitude())))
                            return true;
                        else
                            return false;
                    else
                        return false;
                else
                    return false;}
            else if (side1.isParallel(side4)){
                if (side2.isParallel(side3))
                    if (side1.isOrthogonal(side3))
                        if ((side1.magnitude()) == (side2.magnitude()) && ((side1.magnitude()) == (side3.magnitude())))
                            return true;
                        else
                            return false;
                    else
                        return false;
                else
                    return false;}
            else
                return false;
        }

        public boolean isTrapezoid(){
            if (side1.isParallel(side2) || side1.isParallel(side3) || side1.isParallel(side4) || side2.isParallel(side3) ||  side2.isParallel(side4) ||  side3.isParallel(side4))
                if (this.isParallelogram())
                    return false;
                else
                    return true;
            else
                return false;
        }

        public String classify(){
            String classify = "Quadrilateral";
            if (this.isParallelogram()){
                classify = classify + " - parallelogram";
                if (this.isRhombus()){
                    classify = classify + " - rhombus";
                    if (this.isRectangle()){
                        classify = classify + " - rectangle";
                        if (this.isSquare()){
                            classify = classify + " - square";
                            return classify;
                        }else
                            return classify;
                    }else
                        return classify;
                }else
                    return classify;
            }else if (this.isTrapezoid()){
                classify = classify + " - trapezoid";
                return classify;}
            else
                return classify;
        }
    }
