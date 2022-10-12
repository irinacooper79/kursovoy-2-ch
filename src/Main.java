public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int [] createNewDog( int[]dog);
    int [] newDog = new int [5];
    int a=0;
        for(int i=0; i < dog.length; i++){
        if (dog [i] % 2 == 0) {
            dog[i] = dog[i] + 1;
        }else{
            dog [i] = dog [i];
        }
        if (i >= 3 && i < 8){
            newDog [a] = dog [i];
            a=a+1;
        }
    }
    return newDog;
}