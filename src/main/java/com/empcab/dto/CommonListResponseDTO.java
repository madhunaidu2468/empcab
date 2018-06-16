/**
 * 
 */
package com.empcab.dto;

import java.util.List;

/**
 * @author Madhu.R
 * @param <T>
 *
 */
public class CommonListResponseDTO<T> {

	private List<T> list;

	public CommonListResponseDTO(List<T> list) {
		super();
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
