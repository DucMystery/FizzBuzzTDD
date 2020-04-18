public class FizzBuzz {

    public String checkNumber(int number){
        if (number<=0 || number>99){
            return "Loi";
        }else if (number%5 ==0 && number %3==0){
            return "FizzBuzz";
        } else if (number%3==0 ||number%10==3|| number/10==3){
            return "Fizz";
        }else if (number%5==0 || number%10==5 || number/10 ==5){
            return "Buzz";
        }
        return ""+number;
    }
}
