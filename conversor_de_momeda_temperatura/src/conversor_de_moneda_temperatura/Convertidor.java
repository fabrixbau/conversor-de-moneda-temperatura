package conversor_de_moneda_temperatura;
import javax.swing.JOptionPane;

public class Convertidor {

  
    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = valor / 17.05;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
    }

    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor / 18.77;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
    }

    public void ConvertirPesosAYenes(double valor) {
        double monedaYen = valor / 0.12;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yenes");
    }

    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor / 23.13;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibra + " Libras");
    }

    public void ConvertirPesosAWones(double valor) {
        double monedaWon = valor / 0.014;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaWon + " Wones");
    }
    
    public void ConvertirEurosAPesos(double valor) {
        double monedaPesos = valor * 23.13; 
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
    }

    public void ConvertirDolaresAPesos(double valor) {
        double monedaPesos = valor * 17.05; 
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
    }

    public void ConvertirYenesAPesos(double valor) {
        double monedaPesos = valor * 0.12; 
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double monedaPesos = valor * 23.13; 
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
    }

    public void ConvertirWonesAPesos(double valor) {
        double monedaPesos = valor * 0.014; 
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
    }
 
    public void ConvertirCelsiusAKelvin(double valor) {
        double temperaturaKelvin = valor + 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + temperaturaKelvin + " Kelvin");
    }

    public void ConvertirKelvinACelsius(double valor) {
        double temperaturaCelsius = valor - 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + temperaturaCelsius + " Celsius");
    }

    public void ConvertirCelsiusAFahrenheit(double valor) {
        double temperaturaFahrenheit = (valor * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "Tienes " + temperaturaFahrenheit + " Fahrenheit");
    }

    public void ConvertirFahrenheitACelsius(double valor) {
        double temperaturaCelsius = (valor - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "Tienes " + temperaturaCelsius + " Celsius");
    
	 }
	
}

