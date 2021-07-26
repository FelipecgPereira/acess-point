package com.dio.accesspoint.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class AnnualLeave {
	
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class AnnualLeaveId implements Serializable{

		private static final long serialVersionUID = 1L;
		private Long annualLeaveId;	
		private Long movementId;
		private Long userId;
		
	}
	
	
	@EmbeddedId
	private AnnualLeaveId id;
	private LocalDateTime dateWorked;
	private BigDecimal workedHours;
	private BigDecimal balanceHours;
	
	
}
