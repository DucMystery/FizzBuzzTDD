public class FizzBuzzTranslate {

    public String checkSo(int n){
        String word;
        switch (n){
            case 1:
                word= "mot";
                break;
            case 2:
                word= "hai";
                break;
            case 3:
                word= "ba";
                break;
            case 4:
                word= "bon";
                break;
            case 5:
                word= "nam";
                break;
            case 6:
                word= "sau";
                break;
            case 7:
                word = "bay";
                break;
            case 8:
                word = "tam";
                break;
            case 9:
                word= "chin";
                break;
            case 10:
                word = "muoi";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
        return word.toString();
    }

    public String translate(int number) {

        if (number <= 10) {
            return checkSo(number);
        }else if (number<20 && number>10){
            return "muoi "+checkSo(number%10);
        }else if (number<100 && number>19){
            return checkSo(number/10)+" "+checkSo(number%10);
        }
        return "Loi";
    }
}
