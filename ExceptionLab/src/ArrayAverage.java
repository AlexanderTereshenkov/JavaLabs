public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        int sum = 0;
        try{
            for(int i = 0; i < arr.length; i++){
                sum += Integer.parseInt(arr[i]);
            }
            System.out.println(sum / arr.length);
        }catch (NumberFormatException e){
            System.out.println("Ошибка преобразования числа");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ВЫход за границы массива");
        }
        System.out.println();
    }
}
