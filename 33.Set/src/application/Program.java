package application;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<LogEntry> set = new HashSet<LogEntry>();
		
		set.add(new LogEntry("amanda", Date.from(Instant.parse("2018-08-26T20:45:08Z"))));
		set.add(new LogEntry("alex86", Date.from(Instant.parse("2018-08-26T21:49:37Z"))));
		set.add(new LogEntry("bobbrown", Date.from(Instant.parse("2018-08-27T03:19:13Z"))));
		set.add(new LogEntry("amanda", Date.from(Instant.parse("2018-08-27T08:11:00Z"))));
		set.add(new LogEntry("jeniffer3", Date.from(Instant.parse("2018-08-27T09:19:24Z"))));
		set.add(new LogEntry("alex86", Date.from(Instant.parse("2018-08-27T22:39:52Z"))));
		set.add(new LogEntry("amanda", Date.from(Instant.parse("2018-08-28T07:42:19Z"))));		
		
		System.out.println("Total users: " + set.size());
				
		sc.close();
	}

}
