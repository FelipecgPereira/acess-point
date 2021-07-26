package com.dio.accesspoint.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
	
	@Id
	private Long id;
	@ManyToOne
	private UserCategory userCategory;
	private String name;
	@ManyToOne
	private Company company;
	@ManyToOne
	private AccessLevel accessLevel;
	@ManyToOne
	private WorkingDay workingDay;
	private BigDecimal tolerance;
	private LocalDateTime startWorking;
	private LocalDateTime endWorking;
}
