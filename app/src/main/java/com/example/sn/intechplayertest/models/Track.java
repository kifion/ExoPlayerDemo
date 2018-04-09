package com.example.sn.intechplayertest.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Track implements Parcelable {
	private String artworkUrl100;
	private int trackTimeMillis;
	private String country;
	private String previewUrl;
	private int artistId;
	private String trackName;
	private String collectionName;
	private String artistViewUrl;
	private int discNumber;
	private int trackCount;
	private String artworkUrl30;
	private String wrapperType;
	private String currency;
	private int collectionId;
	private boolean isStreamable;
	private String trackExplicitness;
	private String collectionViewUrl;
	private int trackNumber;
	private String releaseDate;
	private String kind;
	private int trackId;
	private double collectionPrice;
	private int discCount;
	private String primaryGenreName;
	private double trackPrice;
	private String collectionExplicitness;
	private String trackViewUrl;
	private String artworkUrl60;
	private String trackCensoredName;
	private String artistName;
	private String collectionCensoredName;

	public void setArtworkUrl100(String artworkUrl100){
		this.artworkUrl100 = artworkUrl100;
	}

	public String getArtworkUrl100(){
		return artworkUrl100;
	}

	public void setTrackTimeMillis(int trackTimeMillis){
		this.trackTimeMillis = trackTimeMillis;
	}

	public int getTrackTimeMillis(){
		return trackTimeMillis;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPreviewUrl(String previewUrl){
		this.previewUrl = previewUrl;
	}

	public String getPreviewUrl(){
		return previewUrl;
	}

	public void setArtistId(int artistId){
		this.artistId = artistId;
	}

	public int getArtistId(){
		return artistId;
	}

	public void setTrackName(String trackName){
		this.trackName = trackName;
	}

	public String getTrackName(){
		return trackName;
	}

	public void setCollectionName(String collectionName){
		this.collectionName = collectionName;
	}

	public String getCollectionName(){
		return collectionName;
	}

	public void setArtistViewUrl(String artistViewUrl){
		this.artistViewUrl = artistViewUrl;
	}

	public String getArtistViewUrl(){
		return artistViewUrl;
	}

	public void setDiscNumber(int discNumber){
		this.discNumber = discNumber;
	}

	public int getDiscNumber(){
		return discNumber;
	}

	public void setTrackCount(int trackCount){
		this.trackCount = trackCount;
	}

	public int getTrackCount(){
		return trackCount;
	}

	public void setArtworkUrl30(String artworkUrl30){
		this.artworkUrl30 = artworkUrl30;
	}

	public String getArtworkUrl30(){
		return artworkUrl30;
	}

	public void setWrapperType(String wrapperType){
		this.wrapperType = wrapperType;
	}

	public String getWrapperType(){
		return wrapperType;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setCollectionId(int collectionId){
		this.collectionId = collectionId;
	}

	public int getCollectionId(){
		return collectionId;
	}

	public void setIsStreamable(boolean isStreamable){
		this.isStreamable = isStreamable;
	}

	public boolean isIsStreamable(){
		return isStreamable;
	}

	public void setTrackExplicitness(String trackExplicitness){
		this.trackExplicitness = trackExplicitness;
	}

	public String getTrackExplicitness(){
		return trackExplicitness;
	}

	public void setCollectionViewUrl(String collectionViewUrl){
		this.collectionViewUrl = collectionViewUrl;
	}

	public String getCollectionViewUrl(){
		return collectionViewUrl;
	}

	public void setTrackNumber(int trackNumber){
		this.trackNumber = trackNumber;
	}

	public int getTrackNumber(){
		return trackNumber;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setTrackId(int trackId){
		this.trackId = trackId;
	}

	public int getTrackId(){
		return trackId;
	}

	public void setCollectionPrice(double collectionPrice){
		this.collectionPrice = collectionPrice;
	}

	public double getCollectionPrice(){
		return collectionPrice;
	}

	public void setDiscCount(int discCount){
		this.discCount = discCount;
	}

	public int getDiscCount(){
		return discCount;
	}

	public void setPrimaryGenreName(String primaryGenreName){
		this.primaryGenreName = primaryGenreName;
	}

	public String getPrimaryGenreName(){
		return primaryGenreName;
	}

	public void setTrackPrice(double trackPrice){
		this.trackPrice = trackPrice;
	}

	public double getTrackPrice(){
		return trackPrice;
	}

	public void setCollectionExplicitness(String collectionExplicitness){
		this.collectionExplicitness = collectionExplicitness;
	}

	public String getCollectionExplicitness(){
		return collectionExplicitness;
	}

	public void setTrackViewUrl(String trackViewUrl){
		this.trackViewUrl = trackViewUrl;
	}

	public String getTrackViewUrl(){
		return trackViewUrl;
	}

	public void setArtworkUrl60(String artworkUrl60){
		this.artworkUrl60 = artworkUrl60;
	}

	public String getArtworkUrl60(){
		return artworkUrl60;
	}

	public void setTrackCensoredName(String trackCensoredName){
		this.trackCensoredName = trackCensoredName;
	}

	public String getTrackCensoredName(){
		return trackCensoredName;
	}

	public void setArtistName(String artistName){
		this.artistName = artistName;
	}

	public String getArtistName(){
		return artistName;
	}

	public void setCollectionCensoredName(String collectionCensoredName){
		this.collectionCensoredName = collectionCensoredName;
	}

	public String getCollectionCensoredName(){
		return collectionCensoredName;
	}

	@Override
 	public String toString(){
		return 
			"Track{" +
			"artworkUrl100 = '" + artworkUrl100 + '\'' + 
			",trackTimeMillis = '" + trackTimeMillis + '\'' + 
			",country = '" + country + '\'' + 
			",previewUrl = '" + previewUrl + '\'' + 
			",artistId = '" + artistId + '\'' + 
			",trackName = '" + trackName + '\'' + 
			",collectionName = '" + collectionName + '\'' + 
			",artistViewUrl = '" + artistViewUrl + '\'' + 
			",discNumber = '" + discNumber + '\'' + 
			",trackCount = '" + trackCount + '\'' + 
			",artworkUrl30 = '" + artworkUrl30 + '\'' + 
			",wrapperType = '" + wrapperType + '\'' + 
			",currency = '" + currency + '\'' + 
			",collectionId = '" + collectionId + '\'' + 
			",isStreamable = '" + isStreamable + '\'' + 
			",trackExplicitness = '" + trackExplicitness + '\'' + 
			",collectionViewUrl = '" + collectionViewUrl + '\'' + 
			",trackNumber = '" + trackNumber + '\'' + 
			",releaseDate = '" + releaseDate + '\'' + 
			",kind = '" + kind + '\'' + 
			",trackId = '" + trackId + '\'' + 
			",collectionPrice = '" + collectionPrice + '\'' + 
			",discCount = '" + discCount + '\'' + 
			",primaryGenreName = '" + primaryGenreName + '\'' + 
			",trackPrice = '" + trackPrice + '\'' + 
			",collectionExplicitness = '" + collectionExplicitness + '\'' + 
			",trackViewUrl = '" + trackViewUrl + '\'' + 
			",artworkUrl60 = '" + artworkUrl60 + '\'' + 
			",trackCensoredName = '" + trackCensoredName + '\'' + 
			",artistName = '" + artistName + '\'' + 
			",collectionCensoredName = '" + collectionCensoredName + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.artworkUrl100);
		dest.writeInt(this.trackTimeMillis);
		dest.writeString(this.country);
		dest.writeString(this.previewUrl);
		dest.writeInt(this.artistId);
		dest.writeString(this.trackName);
		dest.writeString(this.collectionName);
		dest.writeString(this.artistViewUrl);
		dest.writeInt(this.discNumber);
		dest.writeInt(this.trackCount);
		dest.writeString(this.artworkUrl30);
		dest.writeString(this.wrapperType);
		dest.writeString(this.currency);
		dest.writeInt(this.collectionId);
		dest.writeByte(this.isStreamable ? (byte) 1 : (byte) 0);
		dest.writeString(this.trackExplicitness);
		dest.writeString(this.collectionViewUrl);
		dest.writeInt(this.trackNumber);
		dest.writeString(this.releaseDate);
		dest.writeString(this.kind);
		dest.writeInt(this.trackId);
		dest.writeDouble(this.collectionPrice);
		dest.writeInt(this.discCount);
		dest.writeString(this.primaryGenreName);
		dest.writeDouble(this.trackPrice);
		dest.writeString(this.collectionExplicitness);
		dest.writeString(this.trackViewUrl);
		dest.writeString(this.artworkUrl60);
		dest.writeString(this.trackCensoredName);
		dest.writeString(this.artistName);
		dest.writeString(this.collectionCensoredName);
	}

	public Track() {
	}

	protected Track(Parcel in) {
		this.artworkUrl100 = in.readString();
		this.trackTimeMillis = in.readInt();
		this.country = in.readString();
		this.previewUrl = in.readString();
		this.artistId = in.readInt();
		this.trackName = in.readString();
		this.collectionName = in.readString();
		this.artistViewUrl = in.readString();
		this.discNumber = in.readInt();
		this.trackCount = in.readInt();
		this.artworkUrl30 = in.readString();
		this.wrapperType = in.readString();
		this.currency = in.readString();
		this.collectionId = in.readInt();
		this.isStreamable = in.readByte() != 0;
		this.trackExplicitness = in.readString();
		this.collectionViewUrl = in.readString();
		this.trackNumber = in.readInt();
		this.releaseDate = in.readString();
		this.kind = in.readString();
		this.trackId = in.readInt();
		this.collectionPrice = in.readDouble();
		this.discCount = in.readInt();
		this.primaryGenreName = in.readString();
		this.trackPrice = in.readDouble();
		this.collectionExplicitness = in.readString();
		this.trackViewUrl = in.readString();
		this.artworkUrl60 = in.readString();
		this.trackCensoredName = in.readString();
		this.artistName = in.readString();
		this.collectionCensoredName = in.readString();
	}

	public static final Creator<Track> CREATOR = new Creator<Track>() {
		@Override
		public Track createFromParcel(Parcel source) {
			return new Track(source);
		}

		@Override
		public Track[] newArray(int size) {
			return new Track[size];
		}
	};
}
