package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "component")
public class ComponentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private Integer cid;

	@Column(name = "cname")
	private String cname;
	@Column(name = "ccolor")
	private String ccolor;
	@Column(name = "cx")
	private Double cx;
	@Column(name = "cy")
	private Double cy;
	
	@Column(name="data")
	private String data;

	public String getData() {
		return data;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcolor() {
		return ccolor;
	}

	public void setCcolor(String ccolor) {
		this.ccolor = ccolor;
	}

	public Double getCx() {
		return cx;
	}

	public void setCx(Double cx) {
		this.cx = cx;
	}

	public Double getCy() {
		return cy;
	}

	public void setCy(Double cy) {
		this.cy = cy;
	}

	public void setData(String data2) {
		// TODO Auto-generated method stub
		this.data = data2;
	}

//	public void setData(String data2) {
//		// TODO Auto-generated method stub
//		
//	}
}