public class IntToRoman {
    public static void convertToRoman(int num){
        System.out.println("Given integer:"+num);
        int[] IntValues={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNums={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder romanresult=new StringBuilder();
        for(int i =0;i<IntValues.length;i++){
            while(num>=IntValues[i]){
                num-=IntValues[i];
                romanresult.append(romanNums[i]);
            }
        }
        System.out.println("Converted Roman numeral:"+romanresult.toString());
    }

    public static void main(String[] args) {
        convertToRoman(250);
    }
}
