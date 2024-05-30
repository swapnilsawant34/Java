package repository;
import java.util.ArrayList;
import model.Address;
import model.Voter;

public class VoterRepository {

	ArrayList al=new ArrayList();
	 
	public boolean addNewVoter(Voter v1)
	{
		return al.add(v1);
	}
	
	public void voterDetails()
	{
		for(Object obj:al)
		{
			Voter v=(Voter)obj;
			Address ad=v.getAddress();
			
			System.out.println("\t"+v.getVoterId()+"\t"+v.getName()+"\t"+v.getContact()+"\t"+v.getEmail()+"\t"+v.getAge()+"\t"+v.getGender());
			
			System.out.println("\t"+ad.getPlotNo()+"\t"+ad.getWardNo()+"\t"+ad.getVillage()+"\t"+ad.getTaluka()+"\t"+ad.getDistrict()+"\t"+ad.getState());
			
			System.out.println("===========================================================================================================");
		}
	}

	public void wardWiseVoterCount() {
		ArrayList wardNocoll=new ArrayList();
		
		for(Object obj:al)
		{
			Voter v=(Voter)obj;
			Address ad=v.getAddress();
			
			boolean b= wardNocoll.contains(ad.getWardNo());
			if(!b)
			{
				wardNocoll.add(ad.getWardNo());
			}
			
		}
		
		for(Object obj:wardNocoll)
		{
			Integer wardNo=(int)obj;
			System.out.println("Ward No"+wardNo+"");
			
			System.out.println("=====================================================================================");
			
		
		
		for(Object obj1:al)
		{
			Voter v=(Voter)obj1;
			Address ad=v.getAddress();
			//int wardNo=0;
			if(ad.getWardNo()==wardNo)
			{
				System.out.println("\t"+v.getVoterId()+"\t"+v.getName()+"\t"+v.getContact()+"\t"+v.getEmail()+"\t"+v.getAge()+"\t"+v.getGender());
				
				System.out.println("\t"+ad.getPlotNo()+"\t"+ad.getWardNo()+"\t"+ad.getVillage()+"\t"+ad.getTaluka()+"\t"+ad.getDistrict()+"\t"+ad.getState());
				
				
			}
			System.out.println("===========================================================================================================");	
				
			
		}
		
	}
}
}
