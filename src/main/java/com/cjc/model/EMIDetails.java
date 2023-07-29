package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EMIDetails {

	@Id
	public int emiID;
	public double emiAmountMonthly;
	public String nextEmiDueDate;
	public String previousEmiStatus;
}
