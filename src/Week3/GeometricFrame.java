package Week3;

import javax.swing.JFrame;

public class GeometricFrame extends JFrame{
    // this function transpose the instance frame
    // bu fonksiyon örnek çerçeveyi transpoze eder
    public void tranpose(){
        // get the width and height of current instance's frame
        // geçerli örneğin çerçevesinin genişliğini ve yüksekliğini alır
        int x = this.getWidth();
        int y = this.getHeight();
        // transpose the frame by swapping the width and height
        // genişliği ve yüksekliği değiştirerek çerçeveyi transpoze edin
        this.setSize(y, x);
    }
    // scale the current frame up to a given factor
    // geçerli çerçeveyi verilen bir faktöre kadar ölçeklendirin
    public void scale(double factor){
        // set the size of the current frame's width and height up to the factor given as an input
        // notice here that setSize expects two integers, so we are making the necessary type cast
        // geçerli çerçevenin genişliğini ve yüksekliğini girdi olarak verilen faktöre kadar ayarlayın
        // burada dikkat edin ki setSize iki tamsayı bekliyor, bu yüzden gerekli tür dönüşümünü yapıyoruz
        this.setSize((int)(this.getWidth() * factor), (int)(this.getHeight() * factor));
    }
    // check if the current instance frame's are is equal to the one passed as an argument (JFrame)
    // geçerli örnek çerçevesinin alanının argüman olarak geçirilen ile aynı olup olmadığını kontrol edin (JFrame)
    public boolean isEqualArea(JFrame frame){
        // just calculate both areas then make the comparison and return the result
        // sadece her iki alanı hesaplayın, ardından karşılaştırmayı yapın ve sonucu döndürün
        return this.getWidth() * this.getHeight() == frame.getWidth() * frame.getHeight();
    }

}
