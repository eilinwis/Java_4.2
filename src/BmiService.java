public class BmiService {
    public double calculate (double weight, double height ) {
      //  float height;
        //float weight;
        double bmi = weight / (height * height);

        return bmi;
    }
}
