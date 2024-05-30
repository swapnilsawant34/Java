package clientApp;
import java.util.*;

import model.Address;
import model.Voter;
import repository.VoterRepository;

public class ClientApplication {

	public static void main(String[] args) {
		VoterRepository voterRepo=new  VoterRepository();
		
		do {
			Scanner xyz=new Scanner(System.in);
			System.out.println("1:Add New Voter");
			System.out.println("2:View All Voter");
			System.out.println("Enter your choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter voter Id");
				int vid=xyz.nextInt();
				//xyz.nextLine();
				System.out.println("Enter the voter name");
				String name=xyz.next();
				System.out.println("Enter the voter Email");
				String email=xyz.next();
				System.out.println("Enter voter the contact number");
				String contact=xyz.next();
				System.out.println("Enter voter gender");
				String gender=xyz.next();
				System.out.println("Ente the voter age");
				int age=xyz.nextInt();
				
				Voter v=new Voter();
				v.setVoterId(vid);
				v.setName(name);
				v.setEmail(email);
				v.setContact(contact);
				v.setAge(age);
				v.setGender(gender);
				//address details of voters 
				
				System.out.println("Enter ploatno");
				int plot=xyz.nextInt();
				System.out.println("Enter wardno");
				int wardNo=xyz.nextInt();
				System.out.println("Enter the village");
				//xyz.nextLine();
				String village=xyz.next();
				System.out.println("Enter the taluka");
				String taluka=xyz.next();
				System.out.println("Enter the district");
				String district=xyz.next();
				System.out.println("Enter state of voter");
				String state=xyz.next();
				
				Address ad=new Address();
				
				ad.setVoterid(vid);
				ad.setWardNo(wardNo);
				ad.setPlotNo(plot);
				ad.setVillage(village);
				ad.setTaluka(taluka);
				ad.setDistrict(district);
				ad.setState(state);
				
				v.setAddress(ad);
				
				boolean b=voterRepo.addNewVoter(v);
				if(b)
				{
					System.out.println("Record Added Success...");
					
				}
				else
				{
					System.out.println("Some problem is there....");
				}
				break;
				
			case 2:
				     voterRepo.voterDetails();
				break;
				
			case 3:
				voterRepo.wardWiseVoterCount();
				
				default:
					System.out.println("Wrong Chocie");
					break;
			}
			
			
		}while(true);

	}

}
