package model;

public class Component {

	private Integer cid;
	private String cname;
	private String ccolor;
	private Double cx;
	private Double cy;
	private String data;
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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

}