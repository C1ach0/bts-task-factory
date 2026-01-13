package fr.rosydev.task;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	private Integer id;
	private String nom;
	private String description;
	private Date dateEcheance;
}
