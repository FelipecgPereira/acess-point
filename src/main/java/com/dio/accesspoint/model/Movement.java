package com.dio.accesspoint.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
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
public class Movement {
	
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovementId implements Serializable{

		private static final long serialVersionUID = 1L;
			
		private Long movementId;
		private Long userId;
		
	}
	
	
	@EmbeddedId
	private MovementId id;
	private LocalDateTime entryDate;
	private LocalDateTime exitDate;
	private BigDecimal period;
	@ManyToOne
	private Occurrence ocorrence;
	@ManyToOne
	private Calendar calendar;
	
}
