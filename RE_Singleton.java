import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Reinforce the singleton pattern
*/
public class RE_Singleton {
        public static void main(String[] args) {

        }

        public static Planet thePlanet;

        static {
            try {
                readKeyFromConsoleAndInitPlanet();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void readKeyFromConsoleAndInitPlanet() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String consoleInput = reader.readLine();
            switch (consoleInput) {
                case Planet.EARTH :
                    thePlanet = Earth.getInstance();
                    break;
                case Planet.MOON :
                    thePlanet = Moon.getInstance();
                    break;
                case Planet.SUN :
                    thePlanet = Sun.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }
        }
    }

