package com.javasampleapproach.mysql.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import com.javasampleapproach.mysql.association.model.Activities;
import com.javasampleapproach.mysql.association.model.Association;
import com.javasampleapproach.mysql.association.model.NameofAssociation;
import com.javasampleapproach.mysql.association.model.President;
import com.javasampleapproach.mysql.association.model.Secratary;
import com.javasampleapproach.mysql.association.repo.ActivityRepository;
import com.javasampleapproach.mysql.association.repo.AssociationRepository;
import com.javasampleapproach.mysql.association.repo.NameofAssociationRepository;
import com.javasampleapproach.mysql.association.repo.PresidentRepository;
import com.javasampleapproach.mysql.association.repo.SecrataryRepository;
import com.javasampleapproach.mysql.association.service.ActivitiesService;
import com.javasampleapproach.mysql.association.service.AssociationService;
import com.javasampleapproach.mysql.association.service.NameofAssociationService;
import com.javasampleapproach.mysql.association.service.PresidentService;
import com.javasampleapproach.mysql.association.service.SecrataryService;
import com.javasampleapproach.mysql.exam.model.Classschedule;
import com.javasampleapproach.mysql.exam.model.Datewise;
import com.javasampleapproach.mysql.exam.model.Examdatewise;
import com.javasampleapproach.mysql.exam.model.Examschedule;
import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.exam.model.Examteacherwise;
import com.javasampleapproach.mysql.exam.model.Examtimewise;
import com.javasampleapproach.mysql.exam.model.Examyearwise;
import com.javasampleapproach.mysql.exam.model.Schedule;
import com.javasampleapproach.mysql.exam.model.Semesterwise;
import com.javasampleapproach.mysql.exam.model.Teacherwise;
import com.javasampleapproach.mysql.exam.model.Timewise;
import com.javasampleapproach.mysql.exam.model.Yearwise;
import com.javasampleapproach.mysql.exam.repo.Classschedulerepository;
import com.javasampleapproach.mysql.exam.repo.Datewiserepository;
import com.javasampleapproach.mysql.exam.repo.Examdatewiserepository;
import com.javasampleapproach.mysql.exam.repo.Examschedulerepository;
import com.javasampleapproach.mysql.exam.repo.Examsemesterwiserepository;
import com.javasampleapproach.mysql.exam.repo.Examteacherwiserepository;
import com.javasampleapproach.mysql.exam.repo.Examtimewiserepository;
import com.javasampleapproach.mysql.exam.repo.Examyearwiserepository;
import com.javasampleapproach.mysql.exam.repo.Schedulerepository;
import com.javasampleapproach.mysql.exam.repo.Semesterwiserepository;
import com.javasampleapproach.mysql.exam.repo.Teacherwiserepository;
import com.javasampleapproach.mysql.exam.repo.Timewiserepository;
import com.javasampleapproach.mysql.exam.repo.Yearwiserepository;
import com.javasampleapproach.mysql.exam.service.Classscheduleservice;
import com.javasampleapproach.mysql.exam.service.Datewiseservice;
import com.javasampleapproach.mysql.exam.service.Examdatewiseservice;
import com.javasampleapproach.mysql.exam.service.Examscheduleservice;
import com.javasampleapproach.mysql.exam.service.Examsemesterwiseservice;
import com.javasampleapproach.mysql.exam.service.Examteacherwiseservice;
import com.javasampleapproach.mysql.exam.service.Examtimewiseservice;
import com.javasampleapproach.mysql.exam.service.Examyearwiseservice;
import com.javasampleapproach.mysql.exam.service.Scheduleservice;
import com.javasampleapproach.mysql.exam.service.Semesterwiseservice;
import com.javasampleapproach.mysql.exam.service.Teacherwiseservice;
import com.javasampleapproach.mysql.exam.service.Timewiseservice;
import com.javasampleapproach.mysql.exam.service.Yearwiseservice;
import com.javasampleapproach.mysql.hall.model.Capacity;
import com.javasampleapproach.mysql.hall.model.HouseTutor;
import com.javasampleapproach.mysql.hall.model.Location;
import com.javasampleapproach.mysql.hall.model.NameofHall;
import com.javasampleapproach.mysql.hall.model.NonResidentialStudent;
import com.javasampleapproach.mysql.hall.model.Provost;
import com.javasampleapproach.mysql.hall.model.Residence;
import com.javasampleapproach.mysql.hall.model.ResidentialStudent;
import com.javasampleapproach.mysql.hall.model.ResidentialStuff;
import com.javasampleapproach.mysql.hall.model.ResidentialTeacher;
import com.javasampleapproach.mysql.hall.model.StudentResidence;
import com.javasampleapproach.mysql.hall.model.Stuff;
import com.javasampleapproach.mysql.hall.repo.CapacityRepository;
import com.javasampleapproach.mysql.hall.repo.HouseTutorRepository;
import com.javasampleapproach.mysql.hall.repo.LocationRepository;
import com.javasampleapproach.mysql.hall.repo.NameofHallRepository;
import com.javasampleapproach.mysql.hall.repo.NonResidentialStudentRepository;
import com.javasampleapproach.mysql.hall.repo.ProvostRepository;
import com.javasampleapproach.mysql.hall.repo.ResidenceRepository;
import com.javasampleapproach.mysql.hall.repo.ResidentialStudentRepository;
import com.javasampleapproach.mysql.hall.repo.ResidentialStuffRepository;
import com.javasampleapproach.mysql.hall.repo.ResidentialTeacherRepository;
import com.javasampleapproach.mysql.hall.repo.StudentResidenceRepository;
import com.javasampleapproach.mysql.hall.repo.StuffRepository;
import com.javasampleapproach.mysql.hall.service.CapacityService;
import com.javasampleapproach.mysql.hall.service.HouseTutorService;
import com.javasampleapproach.mysql.hall.service.LocationService;
import com.javasampleapproach.mysql.hall.service.NameofHallService;
import com.javasampleapproach.mysql.hall.service.NonResidentialStudentService;
import com.javasampleapproach.mysql.hall.service.ProvostService;
import com.javasampleapproach.mysql.hall.service.ResidenceService;
import com.javasampleapproach.mysql.hall.service.ResidentialStudentService;
import com.javasampleapproach.mysql.hall.service.ResidentialStuffService;
import com.javasampleapproach.mysql.hall.service.ResidentialTeacherService;
import com.javasampleapproach.mysql.hall.service.StudentResidenceService;
import com.javasampleapproach.mysql.hall.service.StuffService;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Applicant;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.Emergency_contact;
import com.javasampleapproach.mysql.model.Fee;
import com.javasampleapproach.mysql.model.HelpCenter;
import com.javasampleapproach.mysql.model.MarkDistribution;
import com.javasampleapproach.mysql.model.Payment;
import com.javasampleapproach.mysql.model.Result;
import com.javasampleapproach.mysql.model.Routine;
import com.javasampleapproach.mysql.model.Time;
import com.javasampleapproach.mysql.model.Unit;
import com.javasampleapproach.mysql.repo.AdmissionRepository;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.ApplicantRepository;
import com.javasampleapproach.mysql.repo.DateRepository;
import com.javasampleapproach.mysql.repo.EmergencycontactRepository;
import com.javasampleapproach.mysql.repo.FeeRepository;
import com.javasampleapproach.mysql.repo.HelpCenterRepository;
import com.javasampleapproach.mysql.repo.MarkDistributionRepository;
import com.javasampleapproach.mysql.repo.PaymentRepository;
import com.javasampleapproach.mysql.repo.ResultRepository;
import com.javasampleapproach.mysql.repo.RoutineRepository;
import com.javasampleapproach.mysql.repo.TimeRepository;
import com.javasampleapproach.mysql.repo.UnitRepository;
import com.javasampleapproach.mysql.service.AdmissionService;
import com.javasampleapproach.mysql.service.ApiService;
import com.javasampleapproach.mysql.service.ApplicantService;
import com.javasampleapproach.mysql.service.DateService;
import com.javasampleapproach.mysql.service.Emergency_contactService;
import com.javasampleapproach.mysql.service.FeeService;
import com.javasampleapproach.mysql.service.HelpCenterService;
import com.javasampleapproach.mysql.service.MarkDistributionService;
import com.javasampleapproach.mysql.service.PaymentService;
import com.javasampleapproach.mysql.service.ResultService;
import com.javasampleapproach.mysql.service.RoutineService;
import com.javasampleapproach.mysql.service.TimeService;
import com.javasampleapproach.mysql.service.UnitService;




@Controller
@RestController
public class WebController {
	@Autowired
	ApiRepository repository;
	
	
	//Autowired service for hall system****************************************

	@Autowired
	ResidenceRepository repoResidence;
	
	@Autowired
	StudentResidenceRepository repoStudentResidence;
	
	@Autowired
	NameofHallRepository repoNameofHall;
	
	@Autowired
	CapacityRepository repoCapacity;
	
	@Autowired
	LocationRepository repoLocation;
	
	@Autowired
	HouseTutorRepository repoHousetutor;
	
	@Autowired
	ResidentialStudentRepository repoResidentialstudent;
	
	@Autowired
	NonResidentialStudentRepository repoNonresidentialstudent;
	
	@Autowired
	ResidentialTeacherRepository repoResidentialteacher;
	
	@Autowired
	ResidentialStuffRepository repoResidentialstuff;
	
	@Autowired
	ProvostRepository repoProvost;
	
	@Autowired
	StuffRepository repoStuff;
	
	@Autowired
	private CapacityService capacityservice;
	
	@Autowired
	private HouseTutorService housetutorservice;
	
	@Autowired
	private LocationService locationservice;
	
	@Autowired
	private NameofHallService nameofhallservice;
	
	@Autowired
	private NonResidentialStudentService nonresidentialstudentservice;
	
	@Autowired
	private ProvostService provostservice;
	
	@Autowired
	private ResidenceService residenceservice;
	
	@Autowired
	private ResidentialStudentService residentialstudentservice;
	
	@Autowired
	private ResidentialStuffService residentialstuffservice;
	
	@Autowired
	private ResidentialTeacherService residentialteacherservice;
	
	@Autowired
	private StudentResidenceService studentresidenceservice;
	
	@Autowired
	private StuffService stuffservice;
	//End of hall section****************************************************
	
	
	//Autowired service for Association**************************************
	@Autowired
	AssociationRepository repoAssociation;
	

	@Autowired
	NameofAssociationRepository repoNameofAssociation;
	
	@Autowired
	PresidentRepository repoPresident;
	
	@Autowired
	SecrataryRepository repoSecratary;

	
	@Autowired
	ActivityRepository repoActivity;
	
	@Autowired
	private ApiService apiservice;
	
	@Autowired
	private ActivitiesService activitiesservice;
	
	@Autowired
	private AssociationService associationservice;
	
	@Autowired
	private NameofAssociationService nameofassociationservice;
	
	@Autowired
	private PresidentService presidentservice;
	
	@Autowired
	private SecrataryService secrataryservice;
	
	
	//End of association section************************************************
	
	
	//autowired service for addmission*******************************************
	@Autowired
	AdmissionRepository repoAdm;
	
	@Autowired
	UnitRepository repoUnit;
	
	@Autowired
	HelpCenterRepository repoHelpcenter;
	
	@Autowired
	EmergencycontactRepository repoEmergencycontact;
	
	@Autowired
	PaymentRepository repoPayment;
	
	@Autowired
	ApplicantRepository repoApplicant;
	
	@Autowired
	FeeRepository repoFee;
	
	@Autowired
	RoutineRepository repoRoutine;
	
	@Autowired
	DateRepository repoDate;
	
	@Autowired
	TimeRepository repoTime;
	
	@Autowired
	ResultRepository repoResult;
	
	@Autowired
	MarkDistributionRepository repoMarkdist;
	
	@Autowired
	private AdmissionService admissionservice;
	
	@Autowired
	private ApplicantService applicantservice;
	
	@Autowired
	private DateService dateservice;
	
	@Autowired
	private Emergency_contactService emergencycontactservice;
	
	@Autowired
	private FeeService feeservice;

	@Autowired
	private HelpCenterService helpcenterservice;
	
	@Autowired
	private MarkDistributionService markdistributionservice;
	
	@Autowired
	private PaymentService paymentservice;
	
	@Autowired
	private ResultService resultservice;
	
	@Autowired
	private RoutineService routinetservice;
	
	@Autowired
	private TimeService timeservice;
	
	@Autowired
	private UnitService unitservice;
	
	//End of addmission section ************************************************
	
	
	

	//autowired service for EXAM OR CLASS SCHEDULE*******************************************
	@Autowired
	Classschedulerepository repoclassschedule;
	
	@Autowired
	Datewiserepository repodatewise;
	
	@Autowired
	Examdatewiserepository repoexamdatewise;
	
	@Autowired
	Examschedulerepository repoexamschedule;
	
	@Autowired
	Examsemesterwiserepository repoexamsemesterwise;
	
	@Autowired
	Examteacherwiserepository repoexamteacherwise;
	
	@Autowired
	Examtimewiserepository repoexamtimewise;
	
	@Autowired
	Examyearwiserepository repoexamyearwise;
	
	@Autowired
	Schedulerepository reposchedule;
	
	@Autowired
	Semesterwiserepository reposemesterwise;
	
	@Autowired
	Teacherwiserepository repoteacherwise;
	
	@Autowired
	Timewiserepository repotimewise;
	
	@Autowired
	Yearwiserepository repoyearwise;
	
	@Autowired
	private Classscheduleservice classscheduleservice;
	
	@Autowired
	private Datewiseservice datewiseservice;
	
	@Autowired
	private Examdatewiseservice examdatewiseservice;
	
	@Autowired
	private Examtimewiseservice examtimewiseservice;
	
	@Autowired
	private Timewiseservice timewiseservice;
	
	
	@Autowired
	private Examscheduleservice exmascheduleservice;
	
	@Autowired
	private Examsemesterwiseservice examsemesterwiseservice;

	@Autowired
	private Examteacherwiseservice examteacherwiseservice;
	
	@Autowired
	private Examyearwiseservice examyearwiseservice;
	
	@Autowired
	private Scheduleservice scheduleservice;
	
	
	@Autowired
	private Semesterwiseservice semesterwiseservice;

	@Autowired
	private Teacherwiseservice teacherwiseservice;
	
	@Autowired
	private Yearwiseservice yearwiseservice;
	
	
	//End of EXAM OR CLASS SCHEDULE section ************************************************
	
	
	
	
	
	@RequestMapping("/api")
	public String findAll(){
		String result = "<html>";
		
		for(Api cust : repository.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api")
	public void addtapi(@RequestBody  Api api)
	{
		apiservice.addapi(api);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/{id}")
	public void deleteapi(@PathVariable long id)
	{
		apiservice.deleteapi(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/{id}")
	public void updateapi(@RequestBody Api api,@PathVariable long id)
	{
		apiservice.updateapi(id,api);
				
				
	}
	
	@RequestMapping("/api/{id}")
	public Api getapi(@PathVariable long id)
	{
		return apiservice.getapi(id);
				
				
	}
	
	/*@RequestMapping("/api")
	public List<Api> getallapi()
	{
		return apiservice.getallapi();
				
				
	}*/
	
		
		
	//admission section start from here**************************************
	
	@RequestMapping("/api/admission")
	public String findbyAdmission(){
		String result = "<html>";
		
		for(Admission cust : repoAdm.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission")
	public void addadmission(@RequestBody  Admission admission)
	{
		admissionservice.addadmission(admission);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/{id}")
	public void deleteadmission(@PathVariable long id)
	{
		admissionservice.deleteadmission(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/{id}")
	public void updateadmission(@RequestBody Admission admission,@PathVariable long id)
	{
		admissionservice.updateadmission(id,admission);
				
				
	}
	
	
	
	@RequestMapping("/api/admission/{id}")
	public Admission getadmission(@PathVariable long id)
	{
		return admissionservice.getadmission(id);
				
				
	}
	
	@RequestMapping("/admission")
	public List<Admission> getallAdmission()
	{
		return admissionservice.getalladmission();
				
				
	}
	
	@RequestMapping("/api/admission/unit")
	public String findbyUnit(){
		String result = "<html>";
		
		for( Unit cust : repoUnit.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit")
	public void addunit(@RequestBody  Unit unit)
	{
		unitservice.addunit(unit);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/unit/{id}")
	public void deleteunit(@PathVariable long id)
	{
		unitservice.deleteunit(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/{id}")
	public void updateunit(@RequestBody Unit unit,@PathVariable long id)
	{
		unitservice.updateunit(id,unit);
				
				
	}
	
	@RequestMapping("/api/admission/unit/{id}")
	public Unit getunit(@PathVariable long id)
	{
		return unitservice.getunit(id);
				
				
	}
	
	@RequestMapping("/unit")
	public List<Unit> getallunit()
	{
		return unitservice.getallunit();
				
				
	}
	
	
	
	@RequestMapping("/api/admission/helpcenter")
	public String findbyHelpcenter(){
		String result = "<html>";
		
		for( HelpCenter cust : repoHelpcenter.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/helpcenter")
	public void addhelpcenter(@RequestBody  HelpCenter helpcenter)
	{
		helpcenterservice.addhelpcenter(helpcenter);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/helpcenter/{id}")
	public void deletehelpcenter(@PathVariable long id)
	{
		helpcenterservice.deletehelpcenter(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/helpcenter/{id}")
	public void updatehelpcenter(@RequestBody HelpCenter helpcenter,@PathVariable long id)
	{
		helpcenterservice.updatehelpcenter(id,helpcenter);
				
				
	}
	
	@RequestMapping("/api/admission/helpcenter/{id}")
	public HelpCenter gethelpcenter(@PathVariable long id)
	{
		return helpcenterservice.gethelpcenter(id);
				
				
	}
	
	@RequestMapping("/helpcenter")
	public List<HelpCenter> getallhelpcenter()
	{
		return helpcenterservice.getallhelpcenter();
				
				
	}
	
	
	@RequestMapping("/api/admission/emergency_contact")
	public String findbyEmergencycontact(){
		String result = "<html>";
		
		for( Emergency_contact cust : repoEmergencycontact.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/api/admission/emergency_contact")
	public void addemergencycontact(@RequestBody  Emergency_contact emergencycontact)
	{
		emergencycontactservice.addemergencycontact(emergencycontact);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/emergency_contact/{id}")
	public void deleteemergencycontact(@PathVariable long id)
	{
		emergencycontactservice.deleteemergencycontact(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/emergency_contact/{id}")
	public void updateemgergencycontact(@RequestBody Emergency_contact emergency_contact,@PathVariable long id)
	{
		emergencycontactservice.updateemergencycontact(id,emergency_contact);
				
				
	}
	
	@RequestMapping("/api/admission/emergency_contact/{id}")
	public Emergency_contact getemergencycontact(@PathVariable long id)
	{
		return emergencycontactservice.getemergencycontact(id);
				
				
	}
	
	@RequestMapping("/emergency_contact")
	public List<Emergency_contact> getallemergencycontact()
	{
		return emergencycontactservice.getallemergencycontact();
				
				
	}
	
	
	
	
	@RequestMapping("/api/admission/unit/payment")
	public String findbyPayment(){
		String result = "<html>";
		
		for( Payment cust : repoPayment.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/payment")
	public void addpayment(@RequestBody  Payment payment)
	{
		paymentservice.addpayment(payment);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/unit/payment/{id}")
	public void deletepayment(@PathVariable long id)
	{
		paymentservice.deletepayment(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/payment/{id}")
	public void updatepayment(@RequestBody Payment payment,@PathVariable long id)
	{
		paymentservice.updatepayment(id,payment);
				
				
	}
	
	@RequestMapping("/api/admission/unit/payment/{id}")
	public Payment getpayment(@PathVariable long id)
	{
		return paymentservice.getpayment(id);
				
				
	}
	
	@RequestMapping("/payment")
	public List<Payment> getallpayment()
	{
		return paymentservice.getallpayment();
				
				
	}
	
	@RequestMapping("/api/admission/applicant")
	public String findbyApplicant(){
		String result = "<html>";
		
		for( Applicant cust : repoApplicant.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/applicant")
	public void addapplicant(@RequestBody  Applicant applicant)
	{
		applicantservice.addapplicant(applicant);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/admission/applicant/{id}")
	public void deleteapplicant(@PathVariable long id)
	{
		applicantservice.deleteapplicant(id);
				
				
	}


	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/applicant/{id}")
	public void updateapplicant(@RequestBody Applicant applicant,@PathVariable long id)
	{
		applicantservice.updateapplicant(id,applicant);
				
				
	}
	
	@RequestMapping("/api/admission/unit/applicant{id}")
	public Applicant getapplicant(@PathVariable long id)
	{
		return applicantservice.getapplicant(id);
				
				
	}
	
	@RequestMapping("/applicant")
	public List<Applicant> getallapplicant()
	{
		return applicantservice.getallapplicant();
				
				
	}
	
	@RequestMapping("/api/admission/unit/fee")
	public String findbyFee(){
		String result = "<html>";
		
		for(Fee cust : repoFee.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/fee")
	public void addfee(@RequestBody  Fee fee)
	{
		feeservice.addfee(fee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/fee/{id}")
	public void deletefee(@PathVariable long id)
	{
		feeservice.deletefee(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/fee/{id}")
	public void updatefee(@RequestBody Fee fee,@PathVariable long id)
	{
		feeservice.updatefee(id,fee);
				
				
	}
	
	@RequestMapping("/api/admission/unit/fee/{id}")
	public Fee getfee(@PathVariable long id)
	{
		return feeservice.getfee(id);
				
				
	}
	
	@RequestMapping("/fee")
	public List<Fee> getallfee()
	{
		return feeservice.getallfee();
				
				
	}

	
	@RequestMapping("/api/admission/unit/routine")
	public String findbyRoutine(){
		String result = "<html>";
		
		for(Routine cust : repoRoutine.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/routine")
	public void addroutine(@RequestBody  Routine routine)
	{
		routinetservice.addroutine(routine);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/routine/{id}")
	public void deleteroutine(@PathVariable long id)
	{
		routinetservice.deleteroutine(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/routine/{id}")
	public void updateroutine(@RequestBody Routine routine,@PathVariable long id)
	{
		routinetservice.updateroutine(id,routine);
				
				
	}
	
	@RequestMapping("/api/admission/unit/routine/{id}")
	public Routine getroutine(@PathVariable long id)
	{
		return routinetservice.getroutine(id);
				
				
	}
	
	@RequestMapping("/routine")
	public List<Routine> getallroutine()
	{
		return routinetservice.getallroutine();
				
				
	}
	
	@RequestMapping("/api/admission/unit/date")
	public String findbyDate(){
		String result = "<html>";
		
		for(Date cust : repoDate.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/date")
	public void adddate(@RequestBody  Date date)
	{
		dateservice.adddate(date);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/date/{id}")
	public void deletedate(@PathVariable long id)
	{
		dateservice.deletedate(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/date/{id}")
	public void updatedate(@RequestBody Date date,@PathVariable long id)
	{
		dateservice.updatedate(id,date);
				
				
	}
	
	@RequestMapping("/api/admission/unit/date/{id}")
	public Date getdate(@PathVariable long id)
	{
		return dateservice.getdate(id);
				
				
	}
	
	@RequestMapping("/date")
	public List<Date> getalldate()
	{
		return dateservice.getalldate();
				
				
	}
	
	
	@RequestMapping("/api/admission/unit/time")
	public String findbyTime(){
		String result = "<html>";
		
		for(Time cust : repoTime.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/time")
	public void addtime(@RequestBody  Time time)
	{
		timeservice.addtime(time);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/time/{id}")
	public void deletetime(@PathVariable long id)
	{
		timeservice.deletetime(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/time/{id}")
	public void updatetime(@RequestBody Time time,@PathVariable long id)
	{
		timeservice.updatetime(id,time);
				
				
	}
	
	@RequestMapping("/api/admission/unit/time/{id}")
	public Time gettime(@PathVariable long id)
	{
		return timeservice.gettime(id);
				
				
	}
	
	@RequestMapping("/time")
	public List<Time> getalltime()
	{
		return timeservice.getalltime();
				
				
	}
	
	@RequestMapping("/api/admission/unit/result")
	public String findbyResult(){
		String result = "<html>";
		
		for(Result cust : repoResult.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/result")
	public void addresult(@RequestBody  Result result)
	{
		resultservice.addresult(result);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/result/{id}")
	public void deleteresult(@PathVariable long id)
	{
		resultservice.deleteresult(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/result/{id}")
	public void updateresult(@RequestBody Result result,@PathVariable long id)
	{
		resultservice.updateresult(id,result);
				
				
	}
	
	@RequestMapping("/api/admission/unit/result/{id}")
	public Result getresult(@PathVariable long id)
	{
		return resultservice.getresult(id);
				
				
	}
	
	@RequestMapping("/result")
	public List<Result> getallresult()
	{
		return resultservice.getallresult();
				
				
	}
	
	@RequestMapping("/api/admission/unit/markdistribution")
	public String findbyMarkdistribution(){
		String result = "<html>";
		
		for(MarkDistribution cust : repoMarkdist.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/admission/unit/markdistribution")
	public void addmarkdistribution(@RequestBody  MarkDistribution markdistribution)
	{
		markdistributionservice.addmarkdistribution(markdistribution);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/admission/unit/markdistribution{id}")
	public void deletemarkdistribution(@PathVariable long id)
	{
		markdistributionservice.deletemarkdistribution(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/admission/unit/markdistribution/{id}")
	public void updatemarkdistribution(@RequestBody MarkDistribution markdistribution,@PathVariable long id)
	{
		markdistributionservice.updatemarkdistribution(id,markdistribution);
				
				
	}
	
	@RequestMapping("/api/admission/unit/markdistribution/{id}")
	public MarkDistribution getmarkdistribution(@PathVariable long id)
	{
		return markdistributionservice.getmarkdistribution(id);
				
				
	}
	
	/*@RequestMapping("/markdistribution")
	public List<MarkDistribution> getallmarkdistribution()
	{
		return markdistributionservice.getallmarkdistribution();
				
				
	}*/
	
	
	
	//End of Addmission section****************************************************
	
	
	
	
	//Start of Hall section from here**********************************************
	
	@RequestMapping("/api/residence")
	public String findbyResidence(){
		String result = "<html>";
		
		for(Residence cust : repoResidence.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence")
	public void addresidence(@RequestBody  Residence residence)
	{
		residenceservice.addresidence(residence);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/{id}")
	public void deleteresidence(@PathVariable long id)
	{
		residenceservice.deleteresidence(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/{id}")
	public void updateresidence(@RequestBody Residence residence,@PathVariable long id)
	{
		residenceservice.updateresidence(id,residence);
				
				
	}
	
	@RequestMapping("/api/residence/{id}")
	public Residence getresidence(@PathVariable long id)
	{
		return residenceservice.getresidence(id);
				
				
	}
	
	@RequestMapping("/residence")
	public List<Residence> getallresidence()
	{
		return residenceservice.getallresidence();
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence")
	public String findbyStudentResidence(){
		String result = "<html>";
		
		for(StudentResidence cust : repoStudentResidence.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence")
	public void addstudentresidence(@RequestBody  StudentResidence studentresidence)
	{
		studentresidenceservice.addstudentresidence(studentresidence);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/{id}")
	public void deletestudentresidence(@PathVariable long id)
	{
		studentresidenceservice.deletestudentresidence(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/{id}")
	public void updatestudentresidence(@RequestBody StudentResidence studentresidence,@PathVariable long id)
	{
		studentresidenceservice.updatestudentresidence(id,studentresidence);
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/{id}")
	public StudentResidence getstudentresidence(@PathVariable long id)
	{
		return studentresidenceservice.getstudentresidence(id);
				
				
	}
	
	@RequestMapping("/studentresidence")
	public List<StudentResidence> getallstudentresidence()
	{
		return studentresidenceservice.getallstudentresidence();
				
				
	}
	
	
	@RequestMapping("/api/residence/studentresidence/nameofhall")
	public String findbyNameofhall(){
		String result = "<html>";
		
		for(NameofHall cust : repoNameofHall.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall")
	public void addnameofhall(@RequestBody  NameofHall nameofhall)
	{
		nameofhallservice.addnameofhall(nameofhall);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall{id}")
	public void deletenameofhall(@PathVariable long id)
	{
		nameofhallservice.deletenameofhall(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/{id}")
	public void updatenameofhall(@RequestBody NameofHall nameofhall,@PathVariable long id)
	{
		nameofhallservice.updatenameofhall(id,nameofhall);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/{id}")
	public NameofHall getnameofhall(@PathVariable long id)
	{
		return nameofhallservice.getnameofhall(id);
				
				
	}
	
	@RequestMapping("/nameofhall")
	public List<NameofHall> getallnameofhall()
	{
		return nameofhallservice.getallnameofhall();
				
				
	}
	
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/capacity")
	public String findbyCapacity(){
		String result = "<html>";
		
		for(Capacity cust : repoCapacity.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/capacity")
	public void addcapacity(@RequestBody  Capacity capacity)
	{
		capacityservice.addcapacity(capacity);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/capacity/{id}")
	public void deletecapacity(@PathVariable long id)
	{
		capacityservice.deletecapacity(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/capacity/{id}")
	public void updatecapacity(@RequestBody Capacity capacity,@PathVariable long id)
	{
		capacityservice.updatecapacity(id,capacity);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/capacity/{id}")
	public Capacity getcapacity(@PathVariable long id)
	{
		return capacityservice.getcapacity(id);
				
				
	}
	
	@RequestMapping("/capacity")
	public List<Capacity> getallcapacity()
	{
		return capacityservice.getallcapacity();
				
				
	}
	
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/location")
	public String findbyLocation(){
		String result = "<html>";
		
		for(Location cust : repoLocation.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/location")
	public void addlocation(@RequestBody  Location location)
	{
		locationservice.addlocation(location);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/location/{id}")
	public void deletelocation(@PathVariable long id)
	{
		locationservice.deletelocation(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/location/{id}")
	public void updatelocation(@RequestBody Location location,@PathVariable long id)
	{
		locationservice.updatelocation(id,location);
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/location/{id}")
	public Location getlocation(@PathVariable long id)
	{
		return locationservice.getlocation(id);
				
				
	}
	
	@RequestMapping("/location")
	public List<Location> getalllocation()
	{
		return locationservice.getalllocation();
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/residentialstudent")
	public String findbyResidentialStudent(){
		String result = "<html>";
		
		for(ResidentialStudent cust : repoResidentialstudent.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/residentialstudent")
	public void addresidentialstudent(@RequestBody  ResidentialStudent residentialstudent)
	{
		residentialstudentservice.addresidentialstudent(residentialstudent);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/residentialstudent/{id}")
	public void deleteresidentialstudent(@PathVariable long id)
	{
		residentialstudentservice.deleteresidentialstudent(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/residentialstudent/{id}")
	public void updateresidentialstudent(@RequestBody ResidentialStudent residentialstudent,@PathVariable long id)
	{
		residentialstudentservice.updateresidentialstudent(id,residentialstudent);
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/residentialstudent/{id}")
	public ResidentialStudent getresidentialstudent(@PathVariable long id)
	{
		return residentialstudentservice.getresidentialstudent(id);
				
				
	}
	
	@RequestMapping("/residentialstudent")
	public List<ResidentialStudent> getallresidentialstudent()
	{
		return residentialstudentservice.getallresidentialstudent();
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/nonresidentialstudent")
	public String findbyNonResidentialStudent(){
		String result = "<html>";
		
		for(NonResidentialStudent cust : repoNonresidentialstudent.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/nonresidentialstudent")
	public void addnonresidentialstudent(@RequestBody  NonResidentialStudent nonresidentialstudent)
	{
		nonresidentialstudentservice.addnonresidentialstudent(nonresidentialstudent);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/nonresidentialstudent/{id}")
	public void deletenonresidentialstudent(@PathVariable long id)
	{
		nonresidentialstudentservice.deletenonresidentialstudent(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/nonresidentialstudent/{id}")
	public void updatenonresidentialstudent(@RequestBody NonResidentialStudent nonresidentialstudent,@PathVariable long id)
	{
		nonresidentialstudentservice.updatenonresidentialstudent(id,nonresidentialstudent);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/nonresidentialstudent/{id}")
	public NonResidentialStudent getnonresidentialstudent(@PathVariable long id)
	{
		return nonresidentialstudentservice.getnonresidentialstudent(id);
				
				
	}
	

	@RequestMapping("/nonresidentialstudent")
	public List<NonResidentialStudent> getallnonresidentialstudent()
	{
		return nonresidentialstudentservice.getallnonresidentialstudent();
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/provost")
	public String findbyProvost(){
		String result = "<html>";
		
		for(Provost cust : repoProvost.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/provost")
	public void addprovost(@RequestBody  Provost provost)
	{
		provostservice.addprovost(provost);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/provost/{id}")
	public void deleteprovost(@PathVariable long id)
	{
		provostservice.deleteprovost(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/provost/{id}")
	public void updateprovost(@RequestBody Provost provost,@PathVariable long id)
	{
		provostservice.updateprovost(id,provost);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/provost/{id}")
	public Provost getprovost(@PathVariable long id)
	{
		return provostservice.getprovost(id);
				
				
	}
	

	@RequestMapping("/provost")
	public List<Provost> getallprovost()
	{
		return provostservice.getallprovost();
				
				
	}
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/housetutor")
	public String findbyHousetutor(){
		String result = "<html>";
		
		for(HouseTutor cust : repoHousetutor.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/housetutor")
	public void addhousetutor(@RequestBody  HouseTutor housetutor)
	{
		housetutorservice.addhousetutor(housetutor);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/housetutor/{id}")
	public void deletehousetutor(@PathVariable long id)
	{
		housetutorservice.deletehousetutor(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/housetutor/{id}")
	public void updatehousetutor(@RequestBody HouseTutor housetutor ,@PathVariable long id)
	{
		housetutorservice.updatehousetutor(id,housetutor);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/housetutor/{id}")
	public HouseTutor gethousetutor(@PathVariable long id)
	{
		return housetutorservice.gethousetutor(id);
				
				
	}
	

	@RequestMapping("/housetutor")
	public List<HouseTutor> getallhousetutor()
	{
		return housetutorservice.getallhousetutor();
				
				
	}
	
	
	@RequestMapping("/api/residence/studentresidence/nameofhall/stuff")
	public String findbyStuff(){
		String result = "<html>";
		
		for(Stuff cust : repoStuff.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/studentresidence/nameofhall/stuff")
	public void addstuff(@RequestBody  Stuff stuff)
	{
		stuffservice.addstuff(stuff);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/studentresidence/nameofhall/stuff/{id}")
	public void deletestuff(@PathVariable long id)
	{
		stuffservice.deletestuff(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/studentresidence/nameofhall/stuff/{id}")
	public void updatestuff(@RequestBody Stuff stuff,@PathVariable long id)
	{
		stuffservice.updatestuff(id,stuff);
				
				
	}
	

	@RequestMapping("/api/residence/studentresidence/nameofhall/stuff/{id}")
	public Stuff getstuff(@PathVariable long id)
	{
		return stuffservice.getstuff(id);
				
				
	}
	

	@RequestMapping("/stuff")
	public List<Stuff> getallstuff()
	{
		return stuffservice.getallstuff();
				
				
	}
	
	@RequestMapping("/api/residence/residentialteacher")
	public String findbyResidentialTeacher(){
		String result = "<html>";
		
		for(ResidentialTeacher cust : repoResidentialteacher.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/residentialteacher")
	public void addresidentialteacher(@RequestBody  ResidentialTeacher residentialteacher)
	{
		residentialteacherservice.addresidentialteacher(residentialteacher);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/residentialteacher/{id}")
	public void deleteresidentialteacher(@PathVariable long id)
	{
		residentialteacherservice.deleteresidentialteacher(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/residentialteacher/{id}")
	public void updateresidentialteacher(@RequestBody ResidentialTeacher residentialteacher,@PathVariable long id)
	{
		residentialteacherservice.updateresidentialteacher(id,residentialteacher);
				
				
	}
	

	@RequestMapping("/api/residence/residentialteacher/{id}")
	public ResidentialTeacher getresidentialteacher(@PathVariable long id)
	{
		return residentialteacherservice.getresidentialteacher(id);
				
				
	}
	

	@RequestMapping("/residentialteacher")
	public List<ResidentialTeacher> getallresidentialteacher()
	{
		return residentialteacherservice.getallresidentailteacher();
				
				
	}
	
	@RequestMapping("/api/residence/residentialstuff")
	public String findbyResidentialStuff(){
		String result = "<html>";
		
		for(ResidentialStuff cust : repoResidentialstuff.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/residence/residentialstuff")
	public void addresidentialstuff(@RequestBody  ResidentialStuff residentialstuff)
	{
		residentialstuffservice.addresidentialstuff(residentialstuff);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/api/residence/residentialstuff/{id}")
	public void deleteresidentialstuff(@PathVariable long id)
	{
		residentialstuffservice.deleteresidentialstuff(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/residence/residentialstuff/{id}")
	public void updateresidentialstuff(@RequestBody ResidentialStuff residentialstuff,@PathVariable long id)
	{
		residentialstuffservice.updateresidentialstuff(id,residentialstuff);
				
				
	}
	

	@RequestMapping("/api/residence/residentialstuff/{id}")
	public ResidentialStuff getresidentialstuff(@PathVariable long id)
	{
		return residentialstuffservice.getresidentialstuff(id);
				
				
	}
	

	@RequestMapping("/residentialstuff")
	public List<ResidentialStuff> getallresidentialstuff()
	{
		return residentialstuffservice.getallresidentialstuff();
				
				
	}
	
	
	
	//End of hall section******************************************************
	
	
	//Start of Association from here*******************************************
	
	@RequestMapping("/api/association")
	public String findbyAssociation(){
		String result = "<html>";
		
		for(Association cust : repoAssociation.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/association")
	public void addassociation(@RequestBody  Association association)
	{
		associationservice. addassociation(association);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/association/{id}")
	public void deleteassociation(@PathVariable long id)
	{
		associationservice.deleteassociation(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/association/{id}")
	public void updateassociation(@RequestBody Association association,@PathVariable long id)
	{
		associationservice.updateassociation(id,association);
				
				
	}
	

	@RequestMapping("/api/association/{id}")
	public Association getassociation(@PathVariable long id)
	{
		return associationservice.getassociation(id);
				
				
	}
	
	@RequestMapping("/association")
	public List<Association> getallassociation()
	{
		return associationservice.getallassociation();
				
				
	}
	
	
	
	
	
	@RequestMapping("/api/association/nameofassociation")
	public String findbyNameofAssociation(){
		String result = "<html>";
		
		for(NameofAssociation cust : repoNameofAssociation.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/api/association/nameofassociation")
	public void addnameofassociation(@RequestBody  NameofAssociation nameofassociation)
	{
		nameofassociationservice.addnameofassociation(nameofassociation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="api/association/nameofassociation/{id}")
	public void deletenameofassociation(@PathVariable long id)
	{
		nameofassociationservice.deletenameofassociation(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/association/nameofassociation/{id}")
	public void updatenameofassociation(@RequestBody NameofAssociation nameofassociation,@PathVariable long id)
	{
		nameofassociationservice.updatenameofassociation(id,nameofassociation);
				
				
	}
	
	@RequestMapping("/api/association/nameofassociation/{id}")
	public NameofAssociation getnameofassociation(@PathVariable long id)
	{
		return nameofassociationservice.getnameofassociation(id);
				
				
	}
	
	@RequestMapping("/nameofassociation")
	public List<NameofAssociation> getallnameofassociation()
	{
		return nameofassociationservice.getallnameofassociation();
				
				
	}
	
	
	
	@RequestMapping("/api/association/nameofassociation/president")
	public String findbyPresident(){
		String result = "<html>";
		
		for(President cust : repoPresident.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/api/association/nameofassociation/president")
	public void addpresident(@RequestBody  President president)
	{
		presidentservice.addpresident(president);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="api/association/nameofassociation/president/{id}")
	public void deletepresident(@PathVariable long id)
	{
		presidentservice.deletepresident(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/association/nameofassociation/president/{id}")
	public void updatepresident(@RequestBody President president,@PathVariable long id)
	{
		presidentservice.updatepresident(id,president);
				
				
	}
	
	@RequestMapping("/api/association/nameofassociation/president/{id}")
	public President getpresident(@PathVariable long id)
	{
		return presidentservice.getpresident(id);
				
				
	}
	
	@RequestMapping("/president")
	public List<President> getallpresident()
	{
		return presidentservice.getallpresident();
				
				
	}
	
	
	@RequestMapping("/api/association/nameofassociation/secratary")
	public String findbySecratary(){
		String result = "<html>";
		
		for(Secratary cust : repoSecratary.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/association/nameofassociation/secratary")
	public void addsecratary(@RequestBody  Secratary secratary)
	{
		secrataryservice.addsecratary(secratary);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="api/association/nameofassociation/secratary/{id}")
	public void deletesecratary(@PathVariable long id)
	{
		secrataryservice.deletesecratary(id);
				
				
	}
	

	@RequestMapping(method=RequestMethod.PUT,value="/api/association/nameofassociation/secratary/{id}")
	public void updatesecratary(@RequestBody Secratary secratary,@PathVariable long id)
	{
		secrataryservice.updatesecratary(id,secratary);
				
				
	}
	
	@RequestMapping("/api/association/nameofassociation/secratary/{id}")
	public Secratary getsecratary(@PathVariable long id)
	{
		return secrataryservice.getsecratary(id);
				
				
	}
	
	@RequestMapping("/secratary")
	public List<Secratary> getallsecratary()
	{
		return secrataryservice.getallsecratary();
				
				
	}
	
	
	@RequestMapping("/api/association/nameofassociation/activity")
	public String findbyActivity(){
		String result = "<html>";
		
		for(Activities cust : repoActivity.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/association/nameofassociation/activity")
	public void addactivity(@RequestBody  Activities activity)
	{
		activitiesservice.addactivity(activity);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="api/association/nameofassociation/activity/{id}")
	public void deleteactivity(@PathVariable long id)
	{
		activitiesservice.deleteactivity(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/association/nameofassociation/activity/{id}")
	public void updateactivity(@RequestBody Activities activities,@PathVariable long id)
	{
		activitiesservice.updateactivity(id,activities);
				
				
	}
	
	@RequestMapping("/api/association/nameofassociation/activity/{id}")
	public Activities getactivity(@PathVariable long id)
	{
		return activitiesservice.getactivity(id);
				
				
	}
	
	@RequestMapping("/activity")
	public List<Activities> getallactivity()
	{
		return activitiesservice.getallactivity();
				
				
	}
	
	
	//End of Association section ********************************************
	
	//EXAM OR CLASS SCHEDULING START HERE************************************
	
	@RequestMapping("/api/schedule")
	public String findbyschedule(){
		String result = "<html>";
		
		for(Schedule cust : reposchedule.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule")
	public void addschedule(@RequestBody  Schedule schedule)
	{
		scheduleservice.addschedule(schedule);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/{id}")
	public void deleteschedule(@PathVariable long id)
	{
		scheduleservice.deleteschedule(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/{id}")
	public void updateschedule(@RequestBody Schedule schedule,@PathVariable long id)
	{
		scheduleservice.updateschedule(id,schedule);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/{id}")
	public Schedule getschedule(@PathVariable long id)
	{
		return scheduleservice.getschedule(id);
				
				
	}
	
	@RequestMapping("/schedule")
	public List<Schedule> getallschedule()
	{
		return scheduleservice.getallschedule();
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/calssschedule")
	public String findbyclassschedule(){
		String result = "<html>";
		
		for(Classschedule cust : repoclassschedule.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule")
	public void addclassschedule(@RequestBody  Classschedule classschedule)
	{
		classscheduleservice.addclassschedule(classschedule);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/{id}")
	public void deleteclassschedule(@PathVariable long id)
	{
		classscheduleservice.deleteclassschedule(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/{id}")
	public void updateclassschedule(@RequestBody Classschedule classschedule,@PathVariable long id)
	{
		classscheduleservice.updateclassschedule(id,classschedule);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/{id}")
	public Classschedule getclassschedule(@PathVariable long id)
	{
		return classscheduleservice.getclassschedule(id);
				
				
	}
	
	@RequestMapping("/classschedule")
	public List<Classschedule> getallclassschedule()
	{
		return classscheduleservice.getallclassschedule();
				
				
	}
	
	

	@RequestMapping("/api/schedule/examschedule")
	public String findbyexamschedule(){
		String result = "<html>";
		
		for(Examschedule cust : repoexamschedule.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/examschedule")
	public void addexamschedule(@RequestBody  Examschedule examschedule)
	{
		exmascheduleservice.addexamschedule(examschedule);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/examschedule/{id}")
	public void deleteexamschedule(@PathVariable long id)
	{
		exmascheduleservice.deleteexamschedule(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/examschedule/{id}")
	public void updateexamschedule(@RequestBody Examschedule examschedule,@PathVariable long id)
	{
		exmascheduleservice.updateexamschedule(id,examschedule);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/examschedule/{id}")
	public Examschedule getexamschedule(@PathVariable long id)
	{
		return exmascheduleservice.getexamschedule(id);
				
				
	}
	
	@RequestMapping("/examschedule")
	public List<Examschedule> getallexamschedule()
	{
		return exmascheduleservice.getallexamschedule();
				
				
	}
	
	
	@RequestMapping("/api/schedule/calssschedule/datewise")
	public String findbydatewise(){
		String result = "<html>";
		
		for(Datewise cust : repodatewise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/datewise")
	public void adddatewise(@RequestBody  Datewise datewise)
	{
		datewiseservice.adddatewise(datewise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/datewise/{id}")
	public void deletedatewise(@PathVariable long id)
	{
		datewiseservice.deletedatewise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/datewise/{id}")
	public void updatedatewise(@RequestBody Datewise datewise,@PathVariable long id)
	{
		datewiseservice.updatedatewise(id,datewise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/datewise/{id}")
	public Datewise getdatewise(@PathVariable long id)
	{
		return datewiseservice.getdatewise(id);
				
				
	}
	
	@RequestMapping("/datewise")
	public List<Datewise> getalldatewise()
	{
		return datewiseservice.getalldatewise();
				
				
	}
	

	@RequestMapping("/api/schedule/calssschedule/examdatewise")
	public String findbyexamdatewise(){
		String result = "<html>";
		
		for(Examdatewise cust : repoexamdatewise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/examdatewise")
	public void addexamdatewise(@RequestBody  Examdatewise examdatewise)
	{
		examdatewiseservice.addexamdatewise(examdatewise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/examdatewise/{id}")
	public void deleteexamdatewise(@PathVariable long id)
	{
		examdatewiseservice.deleteexamdatewise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/examdatewise/{id}")
	public void updateexamdatewise(@RequestBody Examdatewise examdatewise,@PathVariable long id)
	{
		examdatewiseservice.updateexamdatewise(id,examdatewise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/examdatewise/{id}")
	public Examdatewise getexamdatewise(@PathVariable long id)
	{
		return examdatewiseservice.getexamdatewise(id);
				
				
	}
	
	@RequestMapping("/examdatewise")
	public List<Examdatewise> getallexamdatewise()
	{
		return examdatewiseservice.getallexamdatewise();
				
				
	}
	
	
	@RequestMapping("/api/schedule/calssschedule/timewise")
	public String findbytimewise(){
		String result = "<html>";
		
		for(Timewise cust : repotimewise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/timewise")
	public void addtimewise(@RequestBody  Timewise timewise)
	{
		timewiseservice.addtimewise(timewise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/timewise/{id}")
	public void deletetimewise(@PathVariable long id)
	{
		timewiseservice.deletetimewise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/timewise/{id}")
	public void updatetimewise(@RequestBody Timewise timewise,@PathVariable long id)
	{
		timewiseservice.updatetimewise(id,timewise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/timewise/{id}")
	public Timewise gettimewise(@PathVariable long id)
	{
		return timewiseservice.gettimewise(id);
				
				
	}
	
	@RequestMapping("/timewise")
	public List<Timewise> getalltimewise()
	{
		return timewiseservice.getalltimewise();
				
				
	}
	
	
	
	
	@RequestMapping("/api/schedule/calssschedule/examtimewise")
	public String findbyexamtimewise(){
		String result = "<html>";
		
		for(Examtimewise cust : repoexamtimewise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/examtimewise")
	public void addexamtimewise(@RequestBody  Examtimewise examtimewise)
	{
		examtimewiseservice.addexamtimewise(examtimewise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/examtimewise/{id}")
	public void deleteexamtimewise(@PathVariable long id)
	{
		examtimewiseservice.deleteexamtimewise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/examtimewise/{id}")
	public void updateexamtimewise(@RequestBody Examtimewise examtimewise,@PathVariable long id)
	{
		examtimewiseservice.updateexamtimewise(id,examtimewise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/examtimewise/{id}")
	public Examtimewise getexamtimewise(@PathVariable long id)
	{
		return examtimewiseservice.getexamtimewise(id);
				
				
	}
	
	@RequestMapping("/examtimewise")
	public List<Examtimewise> getallexamtimewise()
	{
		return examtimewiseservice.getallexamtimewise();
				
				
	}
	
	@RequestMapping("/api/schedule/calssschedule/yearwise")
	public String findbyyearwise(){
		String result = "<html>";
		
		for(Yearwise cust : repoyearwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/yearwise")
	public void addyearwise(@RequestBody  Yearwise yearwise)
	{
		yearwiseservice.addyearwise(yearwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/yearwise/{id}")
	public void deleteyearwise(@PathVariable long id)
	{
		yearwiseservice.deleteyearwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/yearwise/{id}")
	public void updateyearwise(@RequestBody Yearwise yearwise,@PathVariable long id)
	{
		yearwiseservice.updateyearwise(id,yearwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/yearwise/{id}")
	public Yearwise getyearwise(@PathVariable long id)
	{
		return yearwiseservice.getyearwise(id);
				
				
	}
	
	@RequestMapping("/yearwise")
	public List<Yearwise> getallyearwise()
	{
		return yearwiseservice.getallyearwise();
				
				
	}
	
	
	@RequestMapping("/api/schedule/calssschedule/examyearwise")
	public String findbyexamyearwise(){
		String result = "<html>";
		
		for(Examyearwise cust : repoexamyearwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/examyearwise")
	public void addexamyearwise(@RequestBody  Examyearwise examyearwise)
	{
		examyearwiseservice.addexamyearwise(examyearwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/examyearwise/{id}")
	public void deleteexamyearwise(@PathVariable long id)
	{
		examyearwiseservice.deleteexamyearwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/examyearwise/{id}")
	public void updateexamyearwise(@RequestBody Examyearwise examyearwise,@PathVariable long id)
	{
		examyearwiseservice.updateexamyearwise(id,examyearwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/examyearwise/{id}")
	public Examyearwise getexamyearwise(@PathVariable long id)
	{
		return examyearwiseservice.getexamyearwise(id);
				
				
	}
	
	@RequestMapping("/examyearwise")
	public List<Examyearwise> getallexamyearwise()
	{
		return examyearwiseservice.getallexamyearwise();
				
				
	}
	
	
	@RequestMapping("/api/schedule/calssschedule/teacherwise")
	public String findbyteacherwise(){
		String result = "<html>";
		
		for(Teacherwise cust : repoteacherwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/teacherwise")
	public void addteachewise(@RequestBody  Teacherwise teacherwise)
	{
		teacherwiseservice.addteacherwise(teacherwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/teacherwise/{id}")
	public void deleteteacherwise(@PathVariable long id)
	{
		teacherwiseservice.deleteteacherwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/teacherwise/{id}")
	public void updateteacherwise(@RequestBody Teacherwise teacherwise,@PathVariable long id)
	{
		teacherwiseservice.updateteacherwise(id,teacherwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/teacherwise/{id}")
	public Teacherwise getteacherwise(@PathVariable long id)
	{
		return teacherwiseservice.getteacherwise(id);
				
				
	}
	
	@RequestMapping("/teacherwise")
	public List<Teacherwise> getallteacherwise()
	{
		return teacherwiseservice.getallteacherwise();
				
				
	}
	
	
	@RequestMapping("/api/schedule/calssschedule/examteacherwise")
	public String findbyexamteacherwise(){
		String result = "<html>";
		
		for(Examteacherwise cust : repoexamteacherwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/examteacherwise")
	public void addexamteachewise(@RequestBody  Examteacherwise examteacherwise)
	{
		examteacherwiseservice.addexamteacherwise(examteacherwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/examteacherwise/{id}")
	public void deleteexamteacherwise(@PathVariable long id)
	{
		examteacherwiseservice.deleteexamteacherwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/examteacherwise/{id}")
	public void updateexamteacherwise(@RequestBody Examteacherwise examteacherwise,@PathVariable long id)
	{
		examteacherwiseservice.updateexamteacherwise(id,examteacherwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/examteacherwise/{id}")
	public Examteacherwise getexamteacherwise(@PathVariable long id)
	{
		return examteacherwiseservice.getexamteacherwise(id);
				
				
	}
	
	@RequestMapping("/examteacherwise")
	public List<Examteacherwise> getallexamteacherwise()
	{
		return examteacherwiseservice.getallexamteacherwise();
				
				
	}
	
	@RequestMapping("/api/schedule/calssschedule/semesterwise")
	public String findbysemesterwise(){
		String result = "<html>";
		
		for(Semesterwise cust : reposemesterwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/semesterwise")
	public void addsemesterwise(@RequestBody  Semesterwise semesterwise)
	{
		semesterwiseservice.addsemesterwise(semesterwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/semesterwise/{id}")
	public void deletesemesterwise(@PathVariable long id)
	{
		semesterwiseservice.deletesemesterwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/semesterwise/{id}")
	public void updatesemesterwise(@RequestBody Semesterwise semesterwise,@PathVariable long id)
	{
		semesterwiseservice.updatesemesterwise(id,semesterwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/semesterwise/{id}")
	public Semesterwise getsemesterwise(@PathVariable long id)
	{
		return semesterwiseservice.getsemesterwise(id);
				
				
	}
	
	@RequestMapping("/semesterwise")
	public List<Semesterwise> getallsemesterwise()
	{
		return semesterwiseservice.getallsemesterwise();
				
				
	}
	
	@RequestMapping("/api/schedule/calssschedule/examsemesterwise")
	public String findbyexamsemesterwise(){
		String result = "<html>";
		
		for(Examsemesterwise cust : repoexamsemesterwise.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/api/schedule/classschedule/examsemesterwise")
	public void addexamsemesterwise(@RequestBody  Examsemesterwise examsemesterwise)
	{
		examsemesterwiseservice.addexamsemesterwise(examsemesterwise);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="api/schedule/classschedule/examsemesterwise/{id}")
	public void deleteexamsemesterwise(@PathVariable long id)
	{
		examsemesterwiseservice.deleteexamsemesterwise(id);
				
				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/schedule/classschedule/examsemesterwise/{id}")
	public void updateexamsemesterwise(@RequestBody Examsemesterwise examsemesterwise,@PathVariable long id)
	{
		examsemesterwiseservice.updateexamsemesterwise(id,examsemesterwise);
				
				
	}
	
	
	
	@RequestMapping("/api/schedule/classschedule/examsemesterwise/{id}")
	public Examsemesterwise getexamsemesterwise(@PathVariable long id)
	{
		return examsemesterwiseservice.getexamsemesterwise(id);
				
				
	}
	
	@RequestMapping("/examsemesterwise")
	public List<Examsemesterwise> getallexamsemesterwise()
	{
		return examsemesterwiseservice.getallexamsemesterwise();
				
				
	}
	
	
	
	
	
	
	//EXAM OR CLASS SCHEDULING END FROM HERE**********************************
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
//	
//	@RequestMapping("/names")
//	public String fetchDataByapi_name1(@RequestParam("api_name") String api_name){
//		String result = "";
//		result = repository.findbyapi_name(api_name).toString();
//		return result;
//		
//	}
//	
//	@RequestMapping("/Apiname")
//	public String fatchDataByapi_name(@RequestParam("api_name") String api_name){
//		String result = "<html>";
//	
//		
//		for(Api cust: repository.findbyapi_name(api_name)){
//			result += "<div>" + cust.toString() + "</div>"; 
//		
//		}		
//		return result + "</html>";
//	
//	}
}