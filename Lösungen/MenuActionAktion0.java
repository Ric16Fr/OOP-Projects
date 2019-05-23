

public class MenuActionAktion0 implements MenuItem, MenuConstants {

    @Override
    public String[] getLocation() {
        // TODO Auto-generated method stub
        String[] locs = {"Auswahl0"};
        return locs;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Aktion0";
    }

    @Override
    public boolean action() {
        // TODO Auto-generated method stub
        System.out.println("Aktion 0 ausgeführt");
        return true;
    }

}
