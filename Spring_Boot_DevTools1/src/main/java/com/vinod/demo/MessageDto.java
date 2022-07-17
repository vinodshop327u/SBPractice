package com.vinod.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class MessageDto 
{
	@Setter
	@Getter
	 private Long id;
	@Setter 
	@Getter
	private String message;

}
