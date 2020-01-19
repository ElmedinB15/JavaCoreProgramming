
package Seven;


public enum EnumList {
    
    RANDOM_BATTLE("Random Battle"),
    TEAM_BATTLE("Team Battle"),
    TANK_COMPANY_bATTLE("Tank Company Battle"),
    STRONGHOLDS_BATTLE("Strongholds: Battles"),
    SPECIAL_BATTLE("Special Battle"),
    TEAM_TRAINING("Team Training"),
    BATTLE_TRAINING("Battle Training");

  
    

    private EnumList(String list) {
        this.list = list;
    }
    
    private String list;
    
    public String GetList(){
        
        return list;
    }
    
    public static void  listAll(){
        
        EnumList[] enums = EnumList.values();
        
        for(EnumList e: enums){
            
            System.out.println(e.GetList());
        }
        
      
    }
    
}
