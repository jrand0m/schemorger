package com.texelz.schemorger.model;

/**
 *
 * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
 * @fullPath Thing > Organization > PerformingGroup > MusicGroup
 *
 * @author Texelz (by Onhate)
 *
 */
public class MusicGroup extends PerformingGroup {

	private MusicAlbum album;
	private Person musicGroupMember;
	private MusicRecording track;
	/**
	 * A music album. Supercedes <a href="albums">albums</a>.
	 */
	public MusicAlbum getAlbum() {
		return this.album;
	}
	public void setAlbum(MusicAlbum album) {
		this.album = album;
	}
	/**
	 * A member of the music group—for example, John, Paul, George, or Ringo.
	 */
	public Person getMusicGroupMember() {
		return this.musicGroupMember;
	}
	public void setMusicGroupMember(Person musicGroupMember) {
		this.musicGroupMember = musicGroupMember;
	}
	/**
	 * A music recording (track)—usually a single song. Supercedes <a href="tracks">tracks</a>.
	 */
	public MusicRecording getTrack() {
		return this.track;
	}
	public void setTrack(MusicRecording track) {
		this.track = track;
	}
}
