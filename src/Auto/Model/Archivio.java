package Auto.Model;


import java.util.*;






public class Archivio {
	private List <Auto> ArchivioAuto;
	public Archivio() {
		super();
		ArchivioAuto=new ArrayList<Auto>();
	}
	public void addAuto(String targa, String km, String anno, String prezzo) {
		ArchivioAuto.add(new Auto(targa,km,anno,prezzo));
		
		
	}
	public List <Auto> getArchivio(){
		return ArchivioAuto;
	}

	public Auto searchAuto(String targa) {
		Iterator<Auto> i=ArchivioAuto.iterator();
		
	    while (i.hasNext()) {
	    	Auto a=i.next();
	    	if (a.getTarga().equals(targa)) {
	    		return a;
	    	}
	    }
	    return null;
	}
	public void deleteAuto(String targa) {
		Iterator<Auto> i=ArchivioAuto.iterator();
		
	    while (i.hasNext()) {
	    	
	    	if (targa.equalsIgnoreCase(i.next().getTarga())) {
	    		i.remove();
	    	}
	    }
	}
}


