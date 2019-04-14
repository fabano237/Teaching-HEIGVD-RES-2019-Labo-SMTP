package configurationData;

import smtpLogic.Person;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public interface ConfigManagerInterface {


        public String getServerAddress();
        public int getServerPort();
        public  int getNumberOfGroup();

        public List<Person> getWitnessToCC();

        public List<String> getMessages();

        public  List<Person> getVictims();
}
