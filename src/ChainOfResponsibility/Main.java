package ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {

		Supervisor supervisor = new Supervisor();

		LeaveRequest leaveRequest1 = new LeaveRequest("Hari", 2);
		supervisor.HandleRequest(leaveRequest1);

		LeaveRequest leaveRequest2 = new LeaveRequest("Krishna", 4);
		supervisor.HandleRequest(leaveRequest2);

		LeaveRequest leaveRequest3 = new LeaveRequest("Latha", 7);
		supervisor.HandleRequest(leaveRequest3);

		LeaveRequest leaveRequest4 = new LeaveRequest("Radha", 20);
		supervisor.HandleRequest(leaveRequest4);

	}

}
