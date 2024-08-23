@FunctionalInterface
interface InterestCalculator{
    int calculate(int p,int r,int t);
}
@FunctionalInterface
interface GuessHighLow{
    boolean Guess(int a);
}

class HigherLowerGame {
    public  void main(String[] args) {
        InterestCalculator I= (p,r,t) -> (p*r*t/100);
        float Interest = I.calculate(1000,10,1);
        System.out.println("Simple Interest is: "+ Interest);


        GuessHighLow g = (a) ->{
            return a <= 5;
        };


    }
}

