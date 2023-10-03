package conversor_de_moneda_temperatura;

import javax.swing.JOptionPane;

public class TestConvertor {
	
	 public static void main(String[] args) {

	        Function conversor = new Function();  

	        boolean flag = true;
	        while (flag) {
	            String opciones = (String) JOptionPane.showInputDialog(null,
	                    "Seleccione una opción de conversión", "Menu",
	                    JOptionPane.QUESTION_MESSAGE, null,
	                    new Object[] { "Conversor de Moneda", "Conversor de Temperatura" },
	                    "Seleccion");

	            switch (opciones) {
	                case "Conversor de Moneda":
	                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
	                    if (validarNumero(input)) {
	                        double Minput = Double.parseDouble(input);
	                        conversor.ConvertirMonedas(Minput);  

	                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
	                        if (JOptionPane.OK_OPTION == respuesta) {
	                            System.out.println("Selecciona opción Afirmativa");
	                        } else {
	                            flag = false;
	                            JOptionPane.showMessageDialog(null, "Programa terminado");
	                        }
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Valor inválido");
	                    }
	                    break;

	                case "Conversor de Temperatura":
	                    String tempInput = JOptionPane.showInputDialog("Ingresa la temperatura: ");
	                    if (validarNumero(tempInput)) {
	                        double temperatura = Double.parseDouble(tempInput);
	                        conversor.ConvertirTemperaturas(temperatura);

	                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión de temperatura?");
	                        if (JOptionPane.OK_OPTION == respuesta) {
	                            System.out.println("Selecciona opción Afirmativa");
	                        } else {
	                            flag = false;
	                            JOptionPane.showMessageDialog(null, "Programa terminado");
	                        }
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Valor inválido");
	                    }
	                    break;
	            }
	            }
	        }
	    

	    public static boolean validarNumero(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

}
