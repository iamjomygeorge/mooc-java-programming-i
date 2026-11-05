public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return identifier;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object comparison){
        if(this == comparison){
            return true;
        }

        if(comparison == null){
            return false;
        }

        if(!(comparison instanceof Archive)){
            return false;
        }

        Archive comparisonArchive = (Archive) comparison; 

        return identifier.equals(comparisonArchive.identifier);
    }
}
