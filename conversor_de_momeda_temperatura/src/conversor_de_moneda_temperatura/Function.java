package conversor_de_moneda_temperatura;

import javax.swing.JOptionPane;

public class Function {

Convertidor monedas = new Convertidor();
    
    public void ConvertirMonedas(double Minput) {
        String opcion = (String) JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De pesos a dólares", "De pesos a euros", "De pesos a libras esterlinas", "De pesos a won sur coreano", "De pesos a yen japones",
                               "De euros a pesos", "De dólares a pesos", "De yenes a pesos", "De libras esterlinas a pesos", "De wones a pesos" },
                "Seleccion");

        switch (opcion) {
            case "De pesos a dólares":
                monedas.ConvertirPesosADolares(Minput);
                break;
            case "De pesos a euros":
                monedas.ConvertirPesosAEuros(Minput);
                break;
            case "De pesos a libras esterlinas":
                monedas.ConvertirPesosALibras(Minput);
                break;
            case "De pesos a won sur coreano":
                monedas.ConvertirPesosAWones(Minput);
                break;
            case "De pesos a yen japones":
                monedas.ConvertirPesosAYenes(Minput);
                break;
            case "De euros a pesos":
                monedas.ConvertirEurosAPesos(Minput);
                break;
            case "De dólares a pesos":
                monedas.ConvertirDolaresAPesos(Minput);
                break;
            case "De yenes a pesos":
                monedas.ConvertirYenesAPesos(Minput);
                break;
            case "De libras esterlinas a pesos":
                monedas.ConvertirLibrasAPesos(Minput);
                break;
            case "De wones a pesos":
                monedas.ConvertirWonesAPesos(Minput);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
        
        public void ConvertirTemperaturas(double temperatura) {
            String opcion = (String) JOptionPane.showInputDialog(null,
                    "Elije la unidad a la que deseas convertir la temperatura",
                    "Conversión de Temperatura", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[] { "De Celsius a Kelvin", "De Kelvin a Celsius",
                                   "De Celsius a Fahrenheit", "De Fahrenheit a Celsius" },
                    "Seleccion").toString();
            
            switch (opcion) {
                case "De Celsius a Kelvin":
                    monedas.ConvertirCelsiusAKelvin(temperatura);
                    break;

                case "De Kelvin a Celsius":
                    monedas.ConvertirKelvinACelsius(temperatura);
                    break;

                case "De Celsius a Fahrenheit":
                    monedas.ConvertirCelsiusAFahrenheit(temperatura);
                    break;

                case "De Fahrenheit a Celsius":
                    monedas.ConvertirFahrenheitACelsius(temperatura);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        }
}
