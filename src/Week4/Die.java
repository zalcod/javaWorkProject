package Week4;

public class Die extends Object{
    private final int numberOfSides;
    /*this field is kept private
     * to have a fulll control on it
     */

    /* Bu alan private olarak tutulmuştur
     * Tam kontrol sağlamak için
     */
    private int currentValue;

    // constructor is the first method
    // that will be invoked when an instance
    // is being created
    // Constructor, bir örnek oluşturulduğunda çağrılan ilk yöntemdir


    // empty constructor does not take any argument
    // Boş constructor herhangi bir argüman almaz

    public Die()
    {
        this.numberOfSides = 6;
    }
    // a constructor taking an argument
    // this is also an example of method overloading
    // Bir argüman alan constructor, aynı zamanda method overloading örneğidir
    public Die(int numberOfSides)
    {
        if(numberOfSides>0)
            this.numberOfSides = numberOfSides;
        else
            this.numberOfSides = 6; // Negatif veya sıfır girilirse varsayılan olarak 6 yüz eklenir
    }

    // we are allowing others to know about the currentValue
    // Diğerlerine currentValue hakkında bilgi alabilmelerine izin veriyoruz
    public int getCurrentValue()
    {
        return this.currentValue;
    }

    // let others update the currentValue if applicable
    // Diğerlerinin currentValue'yi güncellemelerine izin veriyoruz, uygunsa
    public void setCurrentValue(int currentValue)
    {
        if ( currentValue >= 1 && currentValue <= this.getNumberOfSides())
            this.currentValue = currentValue;
    }
    // since numberOfSides is "final", we can only let others read it
    // numberOfSides "final" olduğundan, sadece diğerlerinin okumasına izin verebiliriz
    public int getNumberOfSides()
    {
        return this.numberOfSides;
    }


    // roll method will pick a face value that is in the range of the instance
    // an instance could have as many faces as the numberOfSides

    // roll yöntemi, bir örneğin aralığında olan bir yüz değeri seçecektir
    // Bir örneğin numberOfSides kadar yüzü olabilir
    public int roll()
    {
        this.setCurrentValue((int)(Math.random() * this.getNumberOfSides()) + 1);
        return getCurrentValue();
    }
}