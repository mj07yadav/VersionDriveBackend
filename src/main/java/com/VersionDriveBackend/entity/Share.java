
/*
* Share
*  This Class is an Entity for saving data of each file share bw users
*
* 1.0
*
* @authored by Mritunjay Yadav
*/

package com.VersionDriveBackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="Share")
public class Share {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shareid")
	private long shareid;
	
	@Column(name="fromid")
	private long fromid;
	
	@Column(name="toid")
	private long toid;
	
	@Column(name="creationDate")
	private Date creationDate;
	
	@Column(name="permission")
	private String permission;
	
	@ManyToOne
	private FileStuff fileshare;
	
	@PrePersist
	  protected void onCreate() {
	    creationDate = new Date();
	  }


	public long getShareid() {
		return shareid;
	}

	public void setShareid(long shareid) {
		this.shareid = shareid;
	}

	public long getFromid() {
		return fromid;
	}

	public void setFromid(long fromid) {
		this.fromid = fromid;
	}

	public long getToid() {
		return toid;
	}

	public void setToid(long toid) {
		this.toid = toid;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public FileStuff getFileshare() {
		return fileshare;
	}

	public void setFileshare(FileStuff fileshare) {
		this.fileshare = fileshare;
	}

	
}
